package br.edu.ifsp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.fail;

public class SomaDeVetoresTest {
    private SomaDeVetores calculadora;
    @Test
    @DisplayName("testSomaDeVetoresEntradaValida")
    void testSomaDeVetoresEntradaValida(){
        calculadora = new SomaDeVetores();
        calculadora.criarVetorA(2, 5, 8, 34, 5);
        calculadora.criarVetorB(8, 51, 2, 16, 5);
        calculadora.calcularSoma();
        int[] resultadoEsperado = {10, 56, 10, 50, 10};
        assertThat(calculadora.getResultado()).isEqualTo(resultadoEsperado);

    }

}
