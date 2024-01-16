package lista2;


import java.util.Scanner;
public class ListaExerc2_1 {
    public static void main(String[] args){
          Scanner in = new Scanner(System.in);
          
        System.out.print("==CAUCULO DA MEDIA ARITMÉTICA: ==");
        System.out.print("\n");
        
        System.out.println("Insira a primeira nota:");
        double n1 = Integer.parseInt(in.nextLine());
         
         System.out.println("Insira a segunda nota:");
        double n2 = Integer.parseInt(in.nextLine());
         
         System.out.println("Insira a terceira nota:");
        double n3 = Integer.parseInt(in.nextLine());
         
         System.out.println("Insira a quarta nota:");
        double n4 = Integer.parseInt(in.nextLine());
         
         System.out.println("Insira a quinta nota:");
        double n5 = Integer.parseInt(in.nextLine());
         
         double soma = n1+n2+n3+n4+n5;
         double media = soma/5;
         
          System.out.println("Sua media aritmética obtida atraves de suas cinco notas, foi: " + media);
 }     
}