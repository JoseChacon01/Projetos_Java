package aula1_estrutura;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class fila1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean active = true;

        do {
            System.out.println("Bem-vindo(a) ao Vila Mar1" + "! \nEscolha uma opção para iniciarmos seu atendimento:");
            System.out.println();

            System.out.println("1 - Atendimento Para Crianças.");
            System.out.println("2 - Atendimento Para Adultos.");
            System.out.println("3 - Sair");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("==Você esta na fila de atendimento a crianças!==");
                    
                    Queue<String> filacranca = new LinkedList<String>();
                    filacranca.add("pedro lima");
                    filacranca.add("joana lima");
                    filacranca.add("Kaio lima");
                    filacranca.add("Thiago lima");
                    filacranca.add("Ana lima");
                    filacranca.add("Micarla lima");

                    System.out.println("O tamanho da fila1 é: " + filacranca.size());

                    if (filacranca.isEmpty()) {
                        System.out.println("FILA VAZIA");
                    } else {
                        System.out.println("A FILA NÃO ESTA VAZIA:");

                        for (String nomes : filacranca) { //Formato 2 de imprimir os itens da lista = FORMATO DE LISTA SEQUENCIAL
                            System.out.println(nomes);
                        }
                    }
                   
                    System.out.println();
                    break;

                }
                case 2: {

                    System.out.println("==Você esta na fila de atendimento para adultos!==");

                    Queue<String> filaadulto = new LinkedList<String>();
                    filaadulto.add("Maria Silva");
                    filaadulto.add("Pedro Silva");
                    filaadulto.add("Carlos Silva");
                    filaadulto.add("Marcelo Silva");
                    filaadulto.add("Felipe Silva");
                    filaadulto.add("Pedro Silva");
                    System.out.println("O tamanho da fila é: " + filaadulto.size());

                    if (filaadulto.isEmpty()) {
                        System.out.println("FILA VAZIA");
                    } else {
                        System.out.println("A FILA NÃO ESTA VAZIA:");
                        for (String nomes : filaadulto) { //Formato 2 de imprimir os itens da lista = FORMATO DE LISTA SEQUENCIAL
                            System.out.println(nomes);
                        }
                    }

                    System.out.println();
                    break;

                }
                case 3: {
                    active = false;  //Opção de parada
                    break;

                }
            }
        } while (active);
    }
}
