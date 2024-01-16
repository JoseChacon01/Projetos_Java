package lista2;

import java.util.Scanner;
public class ListaExerc2_5 {
    public static void main(String[] args){
          Scanner in = new Scanner(System.in);
          
          System.out.print("==ANALIZANDO TRIANGULOS, DIGITE 3 VALORES E DESCUBRA SE PODEM OU NÃO FORMAR TRIANGULOS:==");
           System.out.print("\n");
           
          System.out.println("Primeiro valor:");
        double ld1 = Integer.parseInt(in.nextLine());
        
        System.out.println("Segundo valor:");
        double ld2 = Integer.parseInt(in.nextLine());
        
        System.out.println("Terceiro valor:");
        double ld3 = Integer.parseInt(in.nextLine());
         System.out.print("\n");
         
        
        if(ld1<ld2+ld3 && ld2<ld1+ld3 && ld3<ld1+ld2){
            System.out.println("Os valores a cima PODEM FORMAR UM TRIANGULO!");
        }else{
            System.out.println("Os valores a cima NÃO PODEM FORMAR UM TRIANGULO!");
        }
}
}
    
