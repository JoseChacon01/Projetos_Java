package lista2;

import java.util.Scanner;
public class ListaExerc2_2 {
    public static void main(String[] args){
          Scanner in = new Scanner(System.in);
          
        System.out.print("==CAUCULO DA MEDIA ARITMÉTICA PONDERADA: ==");
        System.out.print("\n");
        
        System.out.println("Insira a primeira nota:");
        double n1 = Integer.parseInt(in.nextLine());
         
         System.out.println("Insira a segunda nota:");
        double n2 = Integer.parseInt(in.nextLine());
         
         System.out.println("Insira a terceira nota:");
        double n3 = Integer.parseInt(in.nextLine());
         
         System.out.println("Insira a quarta nota:");
        double n4 = Integer.parseInt(in.nextLine());
         
        double pond1= 2;
        double pond2= 3;
        double pond3= 4;
        double pond4= 5;
        
        double mult = (n1*pond1)+(n2*pond2)+(n3*pond3)+(n4*pond4);
        
        double pondTotal = pond1+pond2+pond3+pond4;
        double mediaarit = mult/pondTotal;
         
          System.out.println("Sua media aritmética ponderada obtida atraves de suas cinco notas, foi: " + mediaarit);
 }     
}