package aula1_estrutura;
import java.util.ArrayList;
import java.util.Collections;
public class lista1 {
    public static void main(String[] args){
        
        ArrayList <Integer> numero = new ArrayList<Integer>();
        numero.add(20);
        numero.add(10);
        numero.add(50);
        numero.add(40);
        numero.add(30);
        numero.add(0, 14); // Adicionando o numero 14 na posição 0
        Integer numb = numero.get(2);
        System.out.println("O valor que ocupa a terceira posição é: " + numb);
        
        
        
        System.out.println("A lita possui " + numero.size() + " elementos"); // Verifica quantos elementos compoem a lista
    
       
        boolean existe = numero.contains(50);
        System.out.println("O elemento 50 existe na lista ? " +  existe); // Verificando se determinado elemento existe na lista
        
        
     //  System.out.println(numero); //Formato 1 de imprimir os itens da lista = FORMATO DE VETOR
     
     
     
    for (Integer num : numero){ //Formato 2 de imprimir os itens da lista = FORMATO DE LISTA SEQUENCIAL
        System.out.println(num); 
    }
    
    //Collections.sort(numero);  // Ordenando a lista.
    //System.out.println(numero);
    }
}
