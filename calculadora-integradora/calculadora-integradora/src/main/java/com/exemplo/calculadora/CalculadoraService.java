package com.exemplo.calculadora;

public class CalculadoraService {
    private final Calculadora calculadora;

    public CalculadoraService(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public int calcularExpressaoSimples(int a, int b) {
        int soma = calculadora.somar(a, b);
        int multiplicacao = calculadora.multiplicar(a, b);
        return soma + multiplicacao;
    }
    public int calcularExpressaoSimples1(int a, int b) {
        int dividir = calculadora.dividir(a, b);
        int subtrair = calculadora.subtrair(a, b);
        return dividir + subtrair;
    }
    public int calcularExpressaoSimples2(int a, int b) {
        int somar = calculadora.dividir(a, b);
        int subtrair = calculadora.subtrair(a, b);
        return somar + subtrair;
    }

    public int calcularExpressaoSimples3(int a, int b) {
        int dividir = calculadora.dividir(a, b);
        int multiplicacao = calculadora.multiplicar(a, b);
        return multiplicacao + dividir;
    }

    public int calcularExpressaoSimples4(int a, int b) {
        int soma = calculadora.somar(a, b);
        int dividir = calculadora.dividir(a, b);
        return soma + dividir;
    }

    public int calcularExpressaoSimples5(int a, int b) {
        int subtrair = calculadora.subtrair(a, b);
        int multiplicacao = calculadora.multiplicar(a, b);
        return subtrair + multiplicacao;
    }

}