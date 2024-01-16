package br.edu.ifrn.aula.testes;

import com.mycompany.testedesoft.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author josem
 */
public class CalculadoraTeste {

    String mesage = "Testando Calculadora";

    @Test
    public void testSomar() {
        System.out.println("Testando metodo somar");
        int num1 = 10;
        int num2 = 5;

        int resultadoEsperado = 15;

        Calculadora calculadora = new Calculadora();

        assertEquals(resultadoEsperado, calculadora.somar(num1, num2));
    }

    @Test
    public void testSomarPositivos() {

        System.out.println("Soma de Positivos");

        int num1 = 10;

        int num2 = 5;

        int resultadoEsperado = 15;

        Calculadora caluladora = new Calculadora();

        assertEquals(resultadoEsperado, caluladora.somar(num1, num2));

    }

    @Test
    public void testSomarNegativos() {

        System.out.println("Soma de Negativos");

        int num1 = -10;

        int num2 = -5;

        int resultadoEsperado = -15;

        Calculadora caluladora = new Calculadora();

        assertEquals(resultadoEsperado, caluladora.somar(num1, num2));

    }

    @Test
    public void testSomarPositivoNegativo() {

        System.out.println("Soma de Positivo e Negativo");

        int num1 = -10;

        int num2 = +5;

        int resultadoEsperado = -5;

        Calculadora caluladora = new Calculadora();

        assertEquals(resultadoEsperado, caluladora.somar(num1, num2));

    }

    @Test
    public void multiplicar() {

        System.out.println("Testando metodo de Multiplicação");

        int num1 = 10;

        int num2 = 5;

        int resultadoEsperado = 50;

        Calculadora caluladora = new Calculadora();

        assertEquals(resultadoEsperado, caluladora.multiplicar(num1, num2));

    }

    @Test
    public void dividir() {

        System.out.println("Testando metodo de Divisão");

        int num1 = 100;

        int num2 = 10;

        int resultadoEsperado = 10;

        Calculadora caluladora = new Calculadora();

        assertEquals(resultadoEsperado, caluladora.dividir(num1, num2));

    }

}