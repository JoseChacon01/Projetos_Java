package lista5;

import java.util.Scanner;

public class ListaExerc5_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

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

        double[] vetor = {n1, n2, n3, n4, n5, n6, n7, n8, n9, n10};

        for (double elemento : vetor) {
            System.out.println(elemento);
        }

        double[] container = new double[vetor.length];
        for (int i = 0; i < vetor.length; i = i + 1) {
            container[i] = vetor[(vetor.length - i) - 1];
            System.out.println(container[i]);
        }
        for (double elemento : vetor) {
            System.out.println(elemento);

        }
    }
}

