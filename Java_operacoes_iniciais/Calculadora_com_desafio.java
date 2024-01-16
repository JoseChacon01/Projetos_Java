import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int numero =0;
        do {
        System.out.println("==BEM-VINDO A CALCULADORA, ESCOLHA UMA OPÇÃO:==");
        System.out.print("\n");
        
        System.out.println("1- Encontre o Triplo de Qualquer Numero");
        System.out.println("2- Descubra a Raiz Quadrada de um Numero");
        System.out.println("3- Desafio");
        System.out.println("0- Sair");
   
        
        numero = Integer.parseInt(in.nextLine());
        
        if (numero == 1) {
                System.out.println("==Descubra o Triplo de Qualquer Numero==");
                System.out.println("Digite um Numero:");
                double triplo = Integer.parseInt(in.nextLine());
                System.out.println("O Triplo de " + triplo + " é: " + triplo *3);
        } else {
         if (numero == 2) {
                System.out.println("==Descubra a Raiz Quadrada de um Numero==");
                System.out.println("Digite um numero:");
                double raiz = Integer.parseInt(in.nextLine());
                System.out.println("A Raiz Quadrade de " + raiz + " é: " + raiz*raiz);
        } else {
        if (numero == 3) {
                System.out.println("==DESAFIO==");
                System.out.println("Marta teve sua filha Ana em Jneiro de 1998, aos 25 anos de idade.");
                System.out.println("Somando a idade de Marta mais a idade de Ana, qual valor iremos Obter?");
                int idade = Integer.parseInt(in.nextLine());
            if(idade==71){
                System.out.println("PARABENS, Eu Sabia Que Iria Conseguir!!");
            }else{
                System.out.println("Que Pena, Você Errou, NÃO DESISTA!!");
            }
        } else {
        if (numero == 0) {
                System.out.println("FIM!");
        } else {
            System.out.println("NÚMERO INVÁLIDO");
                        
                    }
                }
            }
        }
        }while(numero !=0);
}
}
