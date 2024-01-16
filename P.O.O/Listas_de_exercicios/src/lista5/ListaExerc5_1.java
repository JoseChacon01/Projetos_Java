package lista5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ListaExerc5_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
 System.out.println("==INSIRA 10 NÚMEROS DE FORMA ALEATORIA, POR FIM, O PROGRAMA IRA APRESENTAR A MEDIA ARITMETICA OBTIDA ATRAVES DELES== ");
 
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

        double[] valores = {n1, n2, n3, n4, n5, n6, n7, n8, n9, n10};

        double soma = 0;
        double mediaArit;
        for (int i = 0; i < valores.length; i = i + 1) {
            soma = soma + valores[i];
        }
        mediaArit = soma / 10;
        DecimalFormat formatador = new DecimalFormat("0.0");
        System.out.println(formatador.format(mediaArit));
    }
}

