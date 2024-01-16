package aula1_estrutura;
import java.io.IOException;
import java.util.Scanner;

public class Aula3_Insertion_and_bubble {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
        
        System.out.print("==COMO VOCÊ PREFERE ORDENAR OS NUMEROS? ==");
        System.out.print("\n");
        System.out.println("1- InsertionSort");
        System.out.println("2- BubbleSort");
       int opcao = Integer.parseInt(in.nextLine());
       
         int quantidade = 10000;
        int[] vetor = new int [quantidade];
        
        for (int i = 0; i< vetor.length; i++){ //preenche o vetor aleatorio
            vetor[i] = (int) (Math.random() * quantidade);
   }
        
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
  }
}
    /*
Componentes:
- José Ramos de Oliveira Moreira Chacon
- Luiz Felipe Silva de Oliveira
- João Maria Floriano Silva Junior
- Robert Ivert
*/
        