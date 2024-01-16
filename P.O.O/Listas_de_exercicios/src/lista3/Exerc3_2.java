package lista3;

import java.util.Scanner;
public class Exerc3_2 {
    public static void main(String[] args){
          Scanner in = new Scanner(System.in);
          
          System.out.print("==CAUCULANDO O VALOR DOS LANCHES!==");
           System.out.print("\n");
           System.out.print("Por gentileza, insira o código do seu pedido:");
           
        double p1=1.2;
        double p2=1.3;
        double p3=1.5;
        double p4=1.2;
        double p5=1.3;
        double p6=1.0;
           
        int codigo = Integer.parseInt(in.nextLine());
        
        System.out.print("Agora insira a quantidade:");
        int quantidade = Integer.parseInt(in.nextLine());
        
       
        
       if(codigo==100){
          System.out.print("O VALOR FINAL A SER PAGO É: " + quantidade*p1); 
       }
       if(codigo==101){
          System.out.print("O VALOR FINAL A SER PAGO É: " + quantidade*p2);
       }
       if(codigo==102){
          System.out.print("O VALOR FINAL A SER PAGO É: " + quantidade*p3);
       }
       if(codigo==103){
          System.out.print("O VALOR FINAL A SER PAGO É: " + quantidade*p4); 
       }
       if(codigo==104){
          System.out.print("O VALOR FINAL A SER PAGO É: " + quantidade*p5);
       }
       if(codigo==105){
          System.out.print("O VALOR FINAL A SER PAGO É: " + quantidade*p6);
       }

}
}