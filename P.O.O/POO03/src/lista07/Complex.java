
package lista07;                                    //QUESTÃO 5 da lista 7
public class Complex {
   double parteReal, parteReal1, parteReal2;
   double parteImaginaria, parteImaginaria1, parteImaginaria2;

public Complex(double parteReal1, double parteImaginaria1, 
        double parteReal2, double parteImaginaria2) {
    
    this.parteReal1 = parteReal1;
    this.parteImaginaria1 = parteImaginaria1;
    this.parteReal2 = parteReal2;
    this.parteImaginaria2 = parteImaginaria2;        
    
}

public Complex() {
    
    parteReal1 = 7;
    parteImaginaria1 = 12;
    parteReal2 = 2;
    parteImaginaria2 = 4;
    
}

public void adicao() {
    
    parteReal = parteReal1 + parteReal2;
    parteImaginaria = parteImaginaria1 + parteImaginaria2;
    
     System.out.println("==ADIÇÃO==");
    System.out.println("Resultado da Parte Real:"+parteReal);
    System.out.println("Resultado da Parte Imaginaria:"+parteImaginaria);
     System.out.print("\n");
}

public void subtracao() {
    
    parteReal = parteReal1 - parteReal2;
    parteImaginaria = parteImaginaria1 - parteImaginaria2;
    
    System.out.println("==SUBTRAÇÃO==");
    System.out.println("Resultado da Parte Real:"+ parteReal);
    System.out.println("Resultado da Parte Imaginaria:"+ parteImaginaria);
}
    
    
}
