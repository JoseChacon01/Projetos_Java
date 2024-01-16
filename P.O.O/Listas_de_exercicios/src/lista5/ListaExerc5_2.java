package lista5;

import java.util.Scanner;

public class ListaExerc5_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("==DIGITE A PRIMEIRA SEQUENCIA DE NUMEROS:==");

        System.out.println("Digite o primeiro número:");
        double numero1 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o segundo número:");
        double numero2 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o terceiro número:");
        double numero3 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o quarto número:");
        double numero4 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o quinto número:");
        double numero5 = Double.parseDouble(in.nextLine());

        System.out.println("DIGITE A SEGUNDA SEQUENCIA DE NUMEROS:==");

        System.out.println("Digite o primeiro número:");
        double numero6 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o segundo número:");
        double numero7 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o terceiro número:");
        double numero8 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o quarto número:");
        double numero9 = Double.parseDouble(in.nextLine());

        System.out.println("Digite o quinto número:");
        double numero10 = Double.parseDouble(in.nextLine());

        double[] valores1 = {numero1, numero2, numero3, numero4, numero5};
        double[] valores2 = {numero6, numero7, numero8, numero9, numero10};

        double[] soma = {valores1[0] + valores2[0], valores1[1] + valores2[1], valores1[2] + valores2[2], valores1[3] + valores2[3], valores1[4] + valores2[4]};
        System.out.println("Calculo correspondente a soma do primeiro elemento do primeiro array com o primeiro elemento do segundo array, e assim por diante:");
        for (double elemento : soma) {
            System.out.println(elemento);
        }

    }
}