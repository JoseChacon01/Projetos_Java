package aula1_estrutura;
import java.io.IOException;
import java.util.Scanner;

public class Aula2_InsertionSort {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
        
        System.out.print("==COMO VOCÊ PREFERE ORDENAR OS NUMEROS? ==");
        System.out.print("\n");
        System.out.println("1- InsertionSort");
        System.out.println("2- BubbleSort");
       int opcao = Integer.parseInt(in.nextLine());
       
        int quantidade = 5;
        int[] vetor = new int [quantidade];
       
      System.out.print("==INSIRA 5 NUMEROS ALEATORIOS: ==");
        System.out.print("\n");
        
         System.out.println("Primeiro numero:");
         vetor[0] = Integer.parseInt(in.nextLine());
         
         System.out.println("Segundo numero:");
         vetor[1] = Integer.parseInt(in.nextLine());
         
         System.out.println("Terceiro numero:");
         vetor[2] = Integer.parseInt(in.nextLine());
         
         System.out.println("Quarto numero:");
         vetor[3] = Integer.parseInt(in.nextLine());
         
         System.out.println("Quinto numero:");
         vetor[4] = Integer.parseInt(in.nextLine());
        
long tempoInicial = System.currentTimeMillis(); // * calculo do tempo de execução

if (opcao==1){        //chama o metodo
System.out.println("==InsertionSort==");
insertionSort(vetor); 
} else if (opcao==2){
    System.out.println("==BubbleSort==");
    bubbleSort(vetor);
}

long tempoFinal = System.currentTimeMillis(); //*

System.out.println("executado em = " + (tempoFinal - tempoInicial) + "ms"); // Exibe o tempo
}
    
    public static void insertionSort (int[] vetor){ // Utilização do metodo 
        int j, key, i;
            
        for (j= 1; j< vetor.length; j++){ //aqui
            
            key = vetor[j];
            for (i = j -1; (i>=0) && (vetor[i]> key); i--){
                vetor[i+1] = vetor[i];
            }
            vetor [i+1]=key;
        } 
    } 
    //bubbleSort
         private static void bubbleSort(int vetor[]){
            boolean troca = true;
                   int aux;
                   while (troca) {
                   troca = false;
                   for (int i = 0; i < vetor.length - 1; i++){

                   if (vetor[i] > vetor[i + 1]){
                   aux = vetor[i];
                   vetor[i] = vetor[i + 1];
                   vetor[i + 1] = aux;
                   troca = true;
                    }
                   }
                  }
                   /*
  A pilha é uma das
estruturas de dados e
trabalha com o formato
LIFO (o último a entrar
é o primeiro a sair,
“Last In, First Out”, em
inglês)
                   */
  }
}
    
        


