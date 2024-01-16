/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author josem
 */
public class testSomarPositivoNegativo {
    
    public testSomarPositivoNegativo() {
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

}
