package lista4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ListaExerc4_8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] pesos = {40, 80, 60, 24, 71, 65, 60, 98, 54, 73, 25, 27, 76, 82, 62, 88, 81, 34, 43, 79, 67, 70, 58, 23, 30};

        int[] idades = {19, 44, 78, 16, 80, 21, 24, 25, 23, 27, 28, 17, 18, 60, 19, 22, 22, 29, 16, 17, 18, 70, 26, 21, 19};
        //
        double[] alturas = {1.80, 1.78, 1.90, 1.55, 1.70, 1.72, 1.83, 1.70, 1.83, 1.90, 1.76, 1.67, 1.75, 1.80, 1.63, 1.80, 1.91, 1.51, 1.78, 1.65, 1.79, 1.65, 1.72, 1.54, 1.67};

        //COMPETÊNCIA 1                    
        int i = 0;
        for (double elemento : idades) {
            if (elemento > 50) {
                i++;
            }
        }
        System.out.println("O número de pessoas com idade superior a 50 anos é " + i);

        //COMPETÊNCIA 2     
        double soma = 0;
        double x = 0;
        for (double valor : idades) {
            if (valor > 10 && valor < 20) {
                x++;
                for (double valor2 : alturas) {
                    soma = soma + valor2;

                }
            }
        }
        DecimalFormat formatador1 = new DecimalFormat("0.0");
        System.out.println("A média das alturas das pessoas com idade entre 10 e 20 anos é: " + formatador1.format(soma / x));

        //COMPETÊNCIA 3
        double a = 0;
        for (double valor3 : pesos) {
            if (valor3 < 60) {
                a = a + 1;
            }
        }
        DecimalFormat formatador2 = new DecimalFormat("0.0");
        System.out.println("A porcentagem de pessoas com peso abaixo de 60 é " + formatador2.format((a * 100) / 25) + "%");

    }

}
