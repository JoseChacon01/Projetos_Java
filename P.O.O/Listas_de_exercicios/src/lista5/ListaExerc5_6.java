package lista5;

import java.util.Arrays;
import java.util.Scanner;

public class ListaExerc5_6 {
     public static void main(String[] args) {
         
         // O usuario ira digitar emtre 0 e 10.
         Scanner sc = new Scanner(System.in);
          int[] num = new int[11];
         //O [11] se refere ao numero de que vao de 0 até 10.
         
         /* O usuario ira digitar 100 numeros entre 0 e 10, 
         e o "sistema" ira mostrar a quantidade de vezes que
         determinado numero foi digitado*/
         int numb = 0;
         
         System.out.println("==Digite 100 números inteiros entre 0 e 10 e o sistema ira identificar a fraquencia em que eles foram digitados==");
         
          for (int i=0; i<100; i++){  // durante 100 vezes o for ira "puxar" o algoritmo do scanner" para que o usuario possa digitar
               System.out.println("Digite o " + (i+1) + " ° numero de 0 a 10");
                numb = Integer.parseInt(sc.nextLine());
                num[numb] +=1;
          }
          
          for (int i=0; i<num.length; i++){
              
              System.out.println("Número" + i + ":" + num[i] + " Vezes");
          }
}
}