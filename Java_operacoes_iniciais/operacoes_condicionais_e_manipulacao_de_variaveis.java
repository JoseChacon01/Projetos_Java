import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args){
        
        //1
        int numero = -10;
       
       if(numero < 0){
           System.out.println("Numero negativo");
       }
       
       //2
       int numero2 = 28;
       int par = numero2 % 2;
       
        if(par == 0){
           System.out.println("Numero par");
       }
        
        //3
        int numero3 = 5;
       int impar = numero3 % 2;
       
        if(impar > 0 || impar < 0){
           System.out.println("Numero impar");
       }
        
        //4
        int numero4 = 3;
       
        if(numero4 >= 1 && numero4 <= 10){
           System.out.println("Correto");
       }
        
        //5
        int nota1 = 60;
        int nota2 = 90;
        int media = (nota1 + nota2) / 2;
        
        if(media >= 60){
           System.out.println("APROVADO");
       }else{
           System.out.println("REPROVADO");
       }
        
        //6
        int valor1 = 10;
        int valor2 = 30;
        
         if(valor1 > valor2){
           System.out.println("Vala1 é maior que Valor2");
       }else{
           System.out.println("Valor2 é maior que Valor1");
       }
        
        
        
        //7
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Digite um número: ");
        int numero5 = Integer.parseInt(sc.nextLine());
        System.out.println("Número Digitado: "+numero5);
        
        System.out.println("Digite outro número: ");
        int numero6 = Integer.parseInt(sc.nextLine());
        System.out.println("Número Digitado: "+numero6);
        
        
}
}