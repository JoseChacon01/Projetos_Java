
import java.util.Scanner;

public class Aula09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        REVISÃO DE EST. CONDICIONAL ENCADEADA
        
        Ex.: Peça para o usuário digitar um número
        inteiro e em seguida deverá imprimir o número
        por extenso (de 1 até 4).
         */
        System.out.println("Digite um dos números a seguir: 1, 2, 3 ou 4");
        int numero = Integer.parseInt(in.nextLine());

        // Primeira possibilidade
        if (numero == 1) {
            System.out.println("UM");
        }
        if (numero == 2) {
            System.out.println("DOIS");
        }
        if (numero == 3) {
            System.out.println("TRÊS");
        }
        if (numero == 4) {
            System.out.println("QUATRO");
        }

        // Segunda Possibilidade
        if (numero == 1) {
            System.out.println("UM");
        } else {
            if (numero == 2) {
                System.out.println("DOIS");
            } else {
                if (numero == 3) {
                    System.out.println("TRÊS");
                } else {
                    if (numero == 4) {
                        System.out.println("QUATRO");
                    } else {
                        System.out.println("NÚMERO INVÁLIDO");
                    }
                }
            }
        }

        /*
        Revisão de String e char
         */
        char caractere1 = 'a';
        char caractere2 = 'b';
        char caractere3 = '@';
        char caractere4 = 'A';
        char caractere5 = '1';

        String nome = "Bruno";
        String nome2 = new String("Bruno");

        /*
        NOVA ESTRUTURA DE CONDIÇÃO: switch
         */
        switch (numero) {
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRÊS");
                break;
            case 4:
                System.out.println("QUATRO");
                break;
            default:
                System.out.println("NÚMERO INVÁLIDO");
        }

        System.out.println("1 Dobro");
        System.out.println("2 Média");
        int opcao = 1; // Usuário vai digitar

        switch (opcao) {
            case 1:
                System.out.println("Digite um número");
                int numero2 = 5;
                System.out.println("O dobro é: " + numero2 * 2);
                break;
            case 2:
                // Pedir para o usuário digitar as 2 notas
                // Calcular a média
                // Imprimir o resultado da média
                break;
            case 3:
            // perguntar ao usuário o desafio
            // Imprimir se ele acertou ou não
        }

    }
}
