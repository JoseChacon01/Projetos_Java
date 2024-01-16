

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author josem
 */
public class calculadoraTeste {
    
    public calculadoraTeste() {
    }
    
@Test

public void testSomar() {

System.out.println("Testando o método Somar");

int num1 = 10;

int num2 = 5;

int resultadoEsperado = 15;

Calculadora caluladora = new Calculadora();

assertEquals(resultadoEsperado, caluladora.somar(num1, num2));
    
}

@BeforeAll

public static void executaAntesDeTudo(){

System.out.println("Executa antes de todos os testes");

}

@BeforeEach

public void executaAntesDosTestes(){

System.out.println("Executa antes de cada teste");

}
}
