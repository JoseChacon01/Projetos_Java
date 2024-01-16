package lista5;

import java.util.Arrays;
import java.util.Scanner;

public class ListaExerc5_5 {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int[] num = new int[10];
       
       System.out.println("==DIGITE 10 NUMEROS E SERA EXIBIDO O MAI0R E O MENOR VALOR ENTRE ELES==");
       
       for (int i=0; i<num.length; i++){
            System.out.println("Digite o " + (i+1) + " ° numero:");
            num[i] = Integer.parseInt(sc.nextLine());
       }
       
       Arrays.sort(num);
       System.out.println("O menor valor é " + num[0]);
       System.out.println("O maior valor é " + num [num.length-1]);
       
        
}
}