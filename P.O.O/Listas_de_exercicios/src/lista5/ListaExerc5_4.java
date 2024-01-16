package lista5;

import java.util.Arrays;

import java.util.Scanner;

public class ListaExerc5_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("==INSIRA 10 NÚMEROS ALEATORIOS NO PROGRAMA, ELES SERÃO EXIBIDOS DE FORMA CRESCENTE==");

        System.out.println("Digite o primeiro número:");
        double n1 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o segundo número:");
        double n2 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o terceiro número:");
        double n3 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o quarto número:");
        double n4 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o quinto número:");
        double n5 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o sexto número:");
        double n6 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o sétimo número:");
        double n7 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o oitavo número:");
        double n8 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o nono número:");
        double n9 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o décimo número:");
        double n10 = Double.parseDouble(in.nextLine());

        double[] desordenados = {n1, n2, n3, n4, n5, n6, n7, n8, n9, n10};
        Arrays.sort(desordenados);

        for (double elemento : desordenados) {
            System.out.println(elemento);
        }
    }
}

