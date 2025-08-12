package br.com.exemplo.bankapp;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas = new ArrayList<>();

    public void criarConta(String titular, double saldoInicial) {
        contas.add(new ContaBancaria(titular, saldoInicial));
    }

    public ContaBancaria buscarConta(String titular) {
        return contas.stream()
                     .filter(c -> c.getTitular().equalsIgnoreCase(titular))
                     .findFirst()
                     .orElse(null);
    }

    public List<ContaBancaria> listarContas() {
        return contas;
    }
}
