package br.com.exemplo.bankapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BancoTest {

    private Banco banco;

    @BeforeEach
    void setUp() {
        banco = new Banco();
    }

    @Test
    void deveCriarContaComSucesso() {
        banco.criarConta("João", 1000);
        ContaBancaria contaDoJoao = banco.buscarConta("João");
        assertNotNull(contaDoJoao, "A conta de João não deveria ser nula.");
        assertEquals(1000, contaDoJoao.getSaldo(), "O saldo inicial da conta deveria ser 1000.");
    }

    @Test
    void deveDepositarComSucesso() {
        banco.criarConta("Maria", 500);
        ContaBancaria contaDaMaria = banco.buscarConta("Maria");
        contaDaMaria.depositar(200);
        assertEquals(700, contaDaMaria.getSaldo(), "O saldo deveria ser 700 após o depósito.");
    }

    @Test
    void deveSacarComSucesso() {
        banco.criarConta("Pedro", 800);
        ContaBancaria contaDoPedro = banco.buscarConta("Pedro");
        contaDoPedro.sacar(300);
        assertEquals(500, contaDoPedro.getSaldo(), "O saldo deveria ser 500 após o saque.");
    }

    @Test
    void naoDevePermitirSaqueMaiorQueSaldo() {
        banco.criarConta("Ana", 400);
        ContaBancaria contaDaAna = banco.buscarConta("Ana");
        assertThrows(IllegalArgumentException.class, () -> {
            contaDaAna.sacar(500);
        }, "Deveria ter lançado uma exceção de saldo insuficiente.");
    }
}