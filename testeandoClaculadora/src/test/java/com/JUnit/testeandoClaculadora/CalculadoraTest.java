package com.JUnit.testeandoClaculadora;

import com.JUnit.testeandoClaculadora.model.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testCalcularSuma() {
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.calcularSuma(3, 5);
        assertEquals(8.0, resultado); // Verifica que la suma sea correcta (3 + 5 = 8)
    }

    @Test
    void testCalcularMenor1() {
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.calcularMenor(3, 5);
        assertEquals(3.0, resultado);
    }


    @Test
    void testCalcularMenor2() {
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.calcularMenor(5, 3);
        assertEquals(3.0, resultado);
    }


    @Test
    public void resultadoMenorQ() {
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.calcularSuma(3, 5);
        assertTrue(resultado > 0);
    }


    @Test
    public void resultadoNoEsNulo() {
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.calcularSuma(2, 5);
        assertNotNull(resultado);
    }


    @Test
    public void resultadoVacio() {
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.calcularSuma(0,1);
        boolean isEmpty = false;
        assertTrue(resultado > 0); // Verifica si result es mayor que 0
        assertFalse(isEmpty); // Verifica si isEmpty es falso
    }

    @Test
    public void resultadoVacio2() {
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.calcularMenor(5,1);
        boolean isEmpty = false;
        assertTrue(resultado > 0); // Verifica si result es mayor que 0
        assertFalse(isEmpty); // Verifica si isEmpty es falso
    }


    @Test
    public void valoresDouble() {
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.calcularSuma(2, 5);
        Double expected = resultado;
        Double actual = resultado;

        assertSame(expected, actual);
    }

    @Test
    public void valoresDouble2() {
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.calcularMenor(2, 5);
        Double expected = resultado;
        Double actual = resultado;

        assertSame(expected, actual);
    }


    @Test
    public void valorIgual(){
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.calcularSuma(3, 2);
        assertEquals(5, resultado); // Verifica si myNumber es igual a 5

    }
    @Test
    public void valorIgual2(){
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.calcularMenor(7, 5); //Uno de los valores a comparar debera ser 5 para pasar el test
        assertEquals(5, resultado); // Verifica si myNumber es igual a 5

    }
}