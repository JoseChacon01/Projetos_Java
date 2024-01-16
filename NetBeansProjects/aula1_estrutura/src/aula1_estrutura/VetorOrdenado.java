/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1_estrutura;

/**
 *
 * @author josem
 */
public class VetorOrdenado {
 public int organizaVetor(int[] n, int i, int [] ordenado){
    //int vogal = 0;
    //int consoante = 0;    
    // verfica se já processou o vetor inteiro
    if (i == 0) {
       return 1; 
    }
    i--;
    if (n[i]% 2 == 0) {  // verifica se é par
        System.out.println("par ");
        for (int j = 0; j < ordenado.length; j++){
           if (ordenado[j] == 0){ //Se for igual a 0, não tem valor ainda
               ordenado[j] = n[i];
               j = ordenado.length;
           }
        }
    }
    else {        
        System.out.println("impar");
        for (int j = ordenado.length - 1; j >= 0; j--){
           if (ordenado[j] == 0){ //Se for igual a 0, não tem valor ainda
               ordenado[j] = n[i];
               System.out.println("Valor: " + ordenado[j]);
               j = -1;
           }
        }
    }   
    return organizaVetor(n,i, ordenado);  
  //  return fatPalavra(n.substring(i-1),i, vogal, consoante);  
    }   
}