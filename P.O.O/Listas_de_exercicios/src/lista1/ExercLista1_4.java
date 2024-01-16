package lista1;


import java.util.Scanner;

public class ExercLista1_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int numero =0;
        double valor;
        do {
        System.out.println("==Digite um numero:==");
        valor = Integer.parseInt(in.nextLine());
        System.out.print("\n");
        
        System.out.print("==QUAL TIPO DE OPERAÇÃO DESEJA REALIZAR COM O NUMERO DIGITADO A CIMA? ==");
         System.out.print("\n");
         
        System.out.println("1- Adição");
        System.out.println("2- Subtra");
        System.out.println("3- Divisão");
        System.out.println("4- Multiplicação");
        System.out.println("0- SAIR");
   
        
        numero = Integer.parseInt(in.nextLine());
        
        if (numero == 1) {
                System.out.println("==VOCÊ CELECIONOU A OPÇÃO DE ADIÇÃO==");
                System.out.println("Digite um Numero para somar com o primeiro valor digitado:");
                double soma = Integer.parseInt(in.nextLine());
                double resultado1 = valor + soma;
                System.out.println("A soma de " + valor + " + " + soma + " é igual a: " + resultado1);
        } else {
         if (numero == 2) {
                System.out.println("==VOCÊ CELECIONOU A OPÇÃO DE SUBTRAÇÃO==");
                System.out.println("Digite um Numero para subtrair do primeiro valor digitado:");
                double subtracao = Integer.parseInt(in.nextLine());
                double resultado2 = valor - subtracao;
                System.out.println("A subtração de " + valor + " - " + subtracao + " é igual a: " + resultado2);
        } else {
        if (numero == 3) {
                System.out.println("==VOCÊ CELECIONOU A OPÇÃO DE DIVISÃO==");
                System.out.println("Digite um Numero para dividir pelo primeiro valor digitado:");
                double divisao = Integer.parseInt(in.nextLine());
                double resultado3 = valor / divisao;
                System.out.println("A operação de " + valor + " / " + divisao + " é igual a: " + resultado3);
        } else {
            if (numero == 4) {
                System.out.println("==VOCÊ CELECIONOU A OPÇÃO DE MULTIPLICAÇÃO==");
                System.out.println("Digite um Numero para multiplicar pelo primeiro valor digitado:");
                double multp = Integer.parseInt(in.nextLine());
                double resultado4 = valor * multp;
                System.out.println("A operação de " + valor + " * " + multp + " é igual a: " + resultado4);
        } else {
        if (numero == 0) {
                System.out.println("FIM!");
        } else {
            System.out.println("NÚMERO INVÁLIDO");
                        
                    }
                }
            }
         }
        }
        }while(numero !=0);
}
}