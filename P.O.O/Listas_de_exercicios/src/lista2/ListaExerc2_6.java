package lista2;

import java.util.Scanner;
public class ListaExerc2_6 {
    public static void main(String[] args){
          Scanner in = new Scanner(System.in);
          
          System.out.print("==INSIRA O VALOR DE SUAS VENDAS PARA SABER SUA COMISSÃO:==");
           System.out.print("\n");
        double vendas = Integer.parseInt(in.nextLine());
        
       if(vendas>0 && vendas<=2000){
           double percentual1=5;
          double porcentagem1=(percentual1*vendas)/100;
          System.out.print("Você ira receber: " + porcentagem1 + " de comissão");
          
       }
       if(vendas>2000 && vendas<8000){
           double percentual2=6;
          double porcentagem2=(percentual2*vendas)/100;
          System.out.print("Você ira receber: " + porcentagem2 + " de comissão");
       }
       if(vendas>8000){
           double percentual3=8;
          double porcentagem3=(percentual3*vendas)/100;
          System.out.print("Você ira receber: " + porcentagem3 + " de comissão");
       }
}
}