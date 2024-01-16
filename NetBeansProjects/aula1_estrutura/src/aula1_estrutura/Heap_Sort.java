/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1_estrutura;
public class Heap_Sort {
    public static void main(String[] args) {
        int[] vetor = new int[10]; //vetor
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length); // gerando elementos aleatorios
        }
        
        System.out.println("Desordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " "); //imprimindo os elementos aleatorios
        }
        
        //Heap Sort
        int n = vetor.length;
        
        for(int i = n / 2 - 1; i >= 0; i--){ //metade do vetor
            aplicarHeap(vetor, n, i);// o heap sera aplicado no vetor considerando o tamanho dele e a posição (i)
        }
        
        System.out.println("\n\nQuase ordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        
        for(int j = n-1; j > 0; j--){ //colocando os maiores elementos do vetor para o final
            int aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;
            
            aplicarHeap(vetor, j, 0);
        }
        
        System.out.println("\n\nOrdenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
    
    private static void aplicarHeap(int[] vetor, int n, int i){ //O metodo Recebera o vetor, int n, int i
        int raiz = i;
        int esquerda = 2*i;
        int direita = 2*i + 1;
        
        if (esquerda < n && vetor[esquerda] > vetor[raiz]){
            raiz = esquerda;
        }
        if (direita < n && vetor[direita] > vetor[raiz]){
            raiz = direita;
        }
        
        if (raiz != i){
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;
            
            aplicarHeap(vetor, n, raiz);// recursividade
        }
    }
}