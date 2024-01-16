package lista1;


import java.util.Scanner;

public class ExercLista1_5 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         //Entradas
         double a, b,c;
         
         //Saidas
         double x1, x2;
         
         //Processamento
         double delta;
         
          System.out.print("== Resolução de uma equação do segundo grau no formato ax2 + bx + c = 0.==");
          
         System.out.print("\n");
         
         System.out.print("Digite o valor de a:");
         a = sc.nextDouble();
         
         System.out.print("Digite o valor de b:");
         b = sc.nextDouble();
         
         System.out.print("Digite o valor de c:");
         c = sc.nextDouble();
         
         delta = (b*b) - (4*a*c);
         
         x1 = (-b + Math.sqrt(delta))/(2*a);
         x2 = (-b - Math.sqrt(delta))/(2*a);
         
          System.out.print("Os valores de X para equação a cima, são: 1" + x1 + " e " + x2 + ".");
}
}