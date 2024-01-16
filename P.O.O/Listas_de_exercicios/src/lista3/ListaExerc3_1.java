package lista3;

import java.util.Scanner;
public class ListaExerc3_1 {
    public static void main(String[] args){
          Scanner in = new Scanner(System.in);
          
          System.out.print("==DIGITE TRÊS NUMEROS E O PROGRAMA IRA IDENTIFICAR O MAIOR ETRE ELES!==");
           System.out.print("\n");
           System.out.print("Digite o primeiro numero:");
        double n1 = Integer.parseInt(in.nextLine());
        
        System.out.print("Digite o segundo numero:");
        double n2 = Integer.parseInt(in.nextLine());
        
        System.out.print("Digite o terceiro numero:");
        double n3 = Integer.parseInt(in.nextLine());
        
       if(n1>n2 && n1>n3){
          System.out.print("O MAIOR VALOR ENTRE OS DIGITADOS É: " + n1); 
       }
       if(n2>n1 && n2>n3){
          System.out.print("O MAIOR VALOR ENTRE OS DIGITADOS É: " + n2);
       }
       if(n3>n2 && n3>n1){
          System.out.print("O MAIOR VALOR ENTRE OS DIGITADOS É: " + n3);
       }
}
}
