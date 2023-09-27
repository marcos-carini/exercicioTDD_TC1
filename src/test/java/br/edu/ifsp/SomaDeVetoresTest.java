package br.edu.ifsp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.fail;

public class SomaDeVetoresTest {
    private SomaDeVetores calculadora;

    @BeforeEach
    void inicializacao() {
        calculadora = new SomaDeVetores();
    }
    @Test
    @DisplayName("testSomaDeVetoresEntradaValida")
    void testSomaDeVetoresEntradaValida(){
        calculadora.criarVetorA(2, 5, 8, 34, 5);
        calculadora.criarVetorB(8, 51, 2, 16, 5);
        int[] resultadoEsperado = {10, 56, 10, 50, 10};
        assertThat(calculadora.calcularSoma()).isEqualTo(resultadoEsperado);
        calculadora.imprimirResultado();
    }

    @Test
    @DisplayName("testSomaDeVetoresValoresNegativos")
    void testSomaDeVetoresValoresNegativos(){
        calculadora.criarVetorA(-10, 0, 10, 20, 30);
        calculadora.criarVetorB(100, 50, 0, -50, -100);
        int[] resultadoEsperado = {90, 50, 10, -30, -70};
        assertThat(calculadora.calcularSoma()).isEqualTo(resultadoEsperado);
        calculadora.imprimirResultado();
    }
    
    @Test
    @DisplayName("testSomaDeVetoresValoresZerados")
    void testSomaDeVetoresValoresZerados(){
        calculadora.criarVetorA(0, 0, 0, 0, 0);
        calculadora.criarVetorB(0, 0, 0, 0, -0);
        int[] resultadoEsperado = {0, 0, 0, 0, 0};
        assertThat(calculadora.calcularSoma()).isEqualTo(resultadoEsperado);
        calculadora.imprimirResultado();

    }
}
