package br.com.exemplo.todolist;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("A descrição da tarefa não pode ser vazia");
        }
        tarefas.add(new Tarefa(descricao));
    }

    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

    public boolean concluirTarefa(int indice) {
        if (indice < 0 || indice >= tarefas.size()) {
            return false;
        }
        tarefas.get(indice).concluir();
        return true;
    }

    public boolean removerTarefa(int indice) {
        if (indice < 0 || indice >= tarefas.size()) {
            return false;
        }
        tarefas.remove(indice);
        return true;
    }
}
