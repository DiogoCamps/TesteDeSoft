package com.exemplo.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraIntegrationTest {

    @Test
    void testExpressaoSimples() {
        Calculadora calculadora = new Calculadora();
        CalculadoraService service = new CalculadoraService(calculadora);

        int resultado = service.calcularExpressaoSimples(2, 3);
        // (2 + 3) + (2 * 3) = 5 + 6 = 11
        assertEquals(11, resultado);
    }
    @Test
    void testExpressionSimples2(){
        Calculadora calculadora = new Calculadora();
        CalculadoraService service = new CalculadoraService(calculadora);

        int resultado = service.calcularExpressaoSimples1(10,2);
        //(10/2) + (2-3) = 4
        assertEquals(13,resultado);
    }
    @Test
    void testExpressionSimples3(){
        Calculadora calculadora = new Calculadora();
        CalculadoraService service = new CalculadoraService(calculadora);
        //(10 + 2) + (10 - 2) = 20
        int resultado = service.calcularExpressaoSimples2(10,2);

        assertEquals(13,resultado);
    }
    @Test
    void testExpressionSimples4(){
        Calculadora calculadora = new Calculadora();
        CalculadoraService service = new CalculadoraService(calculadora);
        int resultado = service.calcularExpressaoSimples3(2,3);
        //(2*3) + (2/3) = 6 + 0,666 = 6,66
        assertEquals(6.0,resultado,0.001);
    }

    @Test
    void testExpressionSimples5(){
        Calculadora calculadora = new Calculadora();
        CalculadoraService service = new CalculadoraService(calculadora);
        int resultado = service.calcularExpressaoSimples4(4,4);
        //(4+4) + (4/4) = 8 + 1 = 9
        assertEquals(9, resultado, 0.001);
    }

    @Test
    void testExpressionSimples6() {
        Calculadora calculadora = new Calculadora();
        CalculadoraService service = new CalculadoraService(calculadora);
        int resultado = service.calcularExpressaoSimples5(4,4);
        //(4-4) + (4*4) = 0 + 16 = 16
        assertEquals(16,resultado);
    }
}
