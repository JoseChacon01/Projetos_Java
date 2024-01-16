package lista2;

import java.util.Scanner;
public class ListaExerc2_4 {
    public static void main(String[] args){
          Scanner in = new Scanner(System.in);
          
          System.out.print("==CAUCULE SEU IMC, ESCOLHA UMA DAS OPÇÕES ABAIXO:==");
          System.out.print("\n");
          System.out.print("001-HOMENS");
          System.out.print("\n");
          System.out.print("002-MULHERES");
          System.out.print("\n");
          int esc = Integer.parseInt(in.nextLine());
          
          if(esc==001){
            
        
          
        System.out.print("==CAUCULO DO IMC DE PESSOAS DO SEXO MASCULINO: ==");
        System.out.print("\n");
        
        System.out.println("Qual seu peso?");
        double peso1 = Double.parseDouble(in.nextLine());
         
         System.out.println("Qual sua altura?");
        double altura1= Double.parseDouble(in.nextLine());
         
      
        
        
        double imc = peso1/(altura1*altura1);
        
        if(imc<20){
            System.out.println("Abaixo do peso!");
        }else{
         if(imc>=20.7 && imc<26.4){
            System.out.println("No peso normal!");
        }else{
         if(imc>=26.4 && imc<27.8){
            System.out.println("Acima do peso!");
        }else{
             if(imc>=27.8 && imc<=31.1){
            System.out.println("Acima do peso ideal!");
        }else{
         if(imc>31.1){
            System.out.println("Obeso");
        }else{
        }
      }
    }        
  }
 }
 }
        if(esc==002){
            
        
         System.out.print("==CAUCULO DO IMC DE PESSOAS DO SEXO FEMININO: ==");
        System.out.print("\n");
        
        System.out.println("Qual seu peso?");
        double peso2 = Double.parseDouble(in.nextLine());
         
         System.out.println("Qual sua altura?");
        double altura2 = Double.parseDouble(in.nextLine());
         
      
        
        
        double imc2 = peso2/(altura2*altura2);
        
        if(imc2<19.1){
            System.out.println("Abaixo do peso!");
        }else{
         if(imc2>=19.1 && imc2<25.8){
            System.out.println("No peso normal!");
        }else{
         if(imc2>=25.8 && imc2<27.3){
            System.out.println("Acima do peso!");
        }else{
             if(imc2>=27.3 && imc2<=32.3){
            System.out.println("Acima do peso ideal!");
        }else{
         if(imc2>32.3){
            System.out.println("Obeso");
        }else{
        }
      }
    }        
  }
 }
 }
}
}