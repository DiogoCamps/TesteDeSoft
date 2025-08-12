package br.com.exemplo.todolist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ListaTarefasTest {

    private ListaTarefas lista;

    @BeforeEach
    void setUp() {
        lista = new ListaTarefas();
    }

    @Test
    public void deveAdicionarTarefaComSucesso() {
        String descricaoTarefa = "Estudar Java";
        lista.adicionarTarefa(descricaoTarefa);
        assertEquals(1, lista.listarTarefas().size(), "A lista deveria conter 1 tarefa.");
        assertEquals(descricaoTarefa, lista.listarTarefas().get(0).getDescricao(), "A descrição da tarefa deveria ser a mesma.");
    }

    @Test
    public void naoDeveAdicionarTarefaComNomeInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            lista.adicionarTarefa("");
        }, "Deveria ter lançado IllegalArgumentException para nome vazio.");
        assertThrows(IllegalArgumentException.class, () -> {
            lista.adicionarTarefa(null);
        }, "Deveria ter lançado IllegalArgumentException para nome nulo.");

        assertEquals(0, lista.listarTarefas().size(), "A lista não deveria ter adicionado nenhuma tarefa.");
    }

    @Test
    public void deveConcluirTarefaExistente() {
        lista.adicionarTarefa("Comprar pão");
        boolean resultado = lista.concluirTarefa(0);
        assertTrue(resultado, "O método deve retornar true ao concluir uma tarefa existente.");
        assertTrue(lista.listarTarefas().get(0).isConcluida(), "A tarefa na posição 0 deveria estar concluída.");
    }

    @Test
    public void naoDeveConcluirTarefaInexistente() {
        boolean resultado = lista.concluirTarefa(5);
        assertFalse(resultado, "O método deve retornar false para um índice inválido.");
    }

    @Test
    public void deveRemoverTarefaComSucesso() {
        lista.adicionarTarefa("Pagar contas");
        boolean resultado = lista.removerTarefa(0);
        assertTrue(resultado, "O método deve retornar true ao remover uma tarefa existente.");
        assertTrue(lista.listarTarefas().isEmpty(), "A lista deveria estar vazia após a remoção.");
    }
}