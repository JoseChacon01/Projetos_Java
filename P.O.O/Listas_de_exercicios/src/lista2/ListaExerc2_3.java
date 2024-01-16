package lista2;

import java.util.Scanner;
public class ListaExerc2_3 {
    public static void main(String[] args){
          Scanner in = new Scanner(System.in);
          
        System.out.print("==CAUCULO DO IMC: ==");
        System.out.print("\n");
        
        System.out.println("Qual seu peso?");
        double peso = Double.parseDouble(in.nextLine());
         
         System.out.println("Qual sua altura?");
        double altura = Double.parseDouble(in.nextLine());
         
      
        
        
        double imc = peso/(altura*altura);
        
        if(imc<18.5){
            System.out.println("Abaixo do peso!");
        }else{
         if(imc>=18.5 && imc<25){
            System.out.println("No peso normal!");
        }else{
         if(imc>=25 && imc<=30){
            System.out.println("Acima do peso!");
        }else{
         if(imc>30){
            System.out.println("Obeso");
        }else{
        }
      }
    }        
  }
}
}