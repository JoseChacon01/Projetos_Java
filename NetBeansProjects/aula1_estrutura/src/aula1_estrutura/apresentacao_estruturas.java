package aula1_estrutura;
import java.io.IOException;
import java.util.Scanner;

public class apresentacao_estruturas {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
        
        System.out.print("==COMO VOCÊ PREFERE ORDENAR OS NUMEROS? ==");
        System.out.print("\n");
        System.out.println("1- InsertionSort");
        System.out.println("2- BubbleSort");
        System.out.println("3- SelectionSort");
        System.out.println("4- QuickSort");
       int opcao = Integer.parseInt(in.nextLine());
       
         int quantidade = 10000;
        int[] vetor = new int [quantidade];
       
        
        for (int i = 0; i< vetor.length; i++){ //preenche o vetor ALEOTORIO
            vetor[i] = (int) (Math.random() * quantidade);
   }  
       /* 
        for (int i = 0; i< vetor.length; i++){ //preenche o vetor de modo CRESCENTE
            vetor[i] = i;
   } 
        
        for (int i = 10000; i== 0 ; i--){ //preenche o vetor de modo DECRESCENTE
            vetor[i] = i;
   }*/
        
long tempoInicial = System.currentTimeMillis(); // * calculo do tempo de execução

if (opcao==1){        //chama o metodo
System.out.println("==InsertionSort==");
insertionSort(vetor); 
} else if (opcao==2){
    System.out.println("==BubbleSort==");
    bubbleSort(vetor);
} else if (opcao==3){
    System.out.println("==SelectionSort==");
   selectionSort(vetor);
} else if (opcao==4){
    System.out.println("==QuickSort==");
    quickSort(vetor,0,vetor.length-1);
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
         
         //selectionSort
           public static void selectionSort(int [] array) {
        for (int fixo = 0; fixo < array.length -1; fixo++){
            int menor = fixo;
           
            for (int i = menor + 1; i < array.length; i++){
                if (array[i] < array[menor]){
                    menor = i;
            }
        }
            if (menor != fixo) {
                int t = array[fixo];
                array[fixo] = array[menor];
                array[menor] = t;
            }
        }
    }
           //quickSort
           private static void quickSort(int[] vetor, int inicio, int fim){
        if(inicio < fim){
            int posicaoPivo = separar(vetor, inicio,fim);
            quickSort(vetor, inicio, posicaoPivo -1);
            quickSort(vetor,posicaoPivo + 1,fim);
        }
    }
    private static int separar(int[] vetor, int inicio, int fim){
        int pivo = vetor[inicio];
        int i = inicio +1, f=fim;
        while (i <= f) {
            if(vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}