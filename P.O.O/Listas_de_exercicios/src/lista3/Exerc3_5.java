package lista3;


import java.util.Scanner;
public class Exerc3_5 {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
       System.out.println("Insira um valor e o sistema dara o menor numero possivel de notas");
        int valor = Integer.parseInt(in.nextLine());
        
        
        if (valor >= 100) {
               int notasde100 = valor/100;
               System.out.println("Quantidade de notas de 100: " + notasde100);
               
               valor= valor - (notasde100*100);
               
                int notasde50 = valor/50;
               System.out.println("Quantidade de notas de 50: " + notasde50);
               
               valor= valor - (notasde50*50);
               
                int notasde10 = valor/10;
               System.out.println("Quantidade de notas de 10: " + notasde10);
               
               
               valor= valor - (notasde10*10);
               
                int notasde5 = valor/5;
               System.out.println("Quantidade de notas de 5: " + notasde5);
               
               
               
                valor= valor - (notasde5*5);
               
                int notasde1 = valor/1;
               System.out.println("Quantidade de notas de 1: " + notasde1);
               
        
         }
        }
        
}