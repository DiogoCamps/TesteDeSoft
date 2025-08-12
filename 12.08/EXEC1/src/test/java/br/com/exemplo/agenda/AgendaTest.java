package br.com.exemplo.agenda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgendaTest {

private Agenda agenda;

    @BeforeEach
    public void setUp() {
        agenda = new Agenda();
}
    @Test
    public void deveAdicionarContato() {
        agenda.adicionarContato("João", "16999999999");
        Contato contato = agenda.buscarContato("João");
        assertNotNull(contato);
        assertEquals("João", contato.getNome());
    }

    @Test
    public void deveRemoverContatoExistente() {
        agenda.adicionarContato("Maria", "16888888888");
        boolean removido = agenda.removerContato("Maria");
        assertTrue(removido);
        assertNull(agenda.buscarContato("Maria"));
    }

    @Test
    public void NaodeveRemoverContatoInexistente() {
        boolean removido = agenda.removerContato("Pedro");
        assertFalse(removido);
    }

    @Test
    public void deveListarContatos() {
        agenda.adicionarContato("Ana", "167777777777");
        agenda.adicionarContato("Carlos", "166666666666");
        assertEquals(2, agenda.listarContatos().size());
    }

}
