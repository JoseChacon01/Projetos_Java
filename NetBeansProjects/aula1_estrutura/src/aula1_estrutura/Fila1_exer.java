package aula1_estrutura;
import java.util.LinkedList;
import java.util.Queue;
public class Fila1_exer {
    public static void main(String[] args){
        Queue<String> FilaExemplo = new LinkedList<String>();
        FilaExemplo.add("João");
        FilaExemplo.add("Ana");
        FilaExemplo.add("Beatriz");
        FilaExemplo.add("Alfredo");
        
        //imprime o primeiro elemento da fila
        System.out.println("O primeiro elemento é "+ FilaExemplo.peek());
        
        FilaExemplo.remove(); // remove o elemento fronfal ('João')
        FilaExemplo.remove(); // remove o elemento fronfal ('Ana')
        
        System.out.println("O elemento a frente da fila é "+ FilaExemplo.peek());
        
        System.out.println("O tamanho da fila é "+ FilaExemplo.size());
        
         if (FilaExemplo.isEmpty()) {
                        System.out.println("FILA VAZIA");
                    } else {
                        System.out.println("A FILA NÃO ESTA VAZIA:");
                    }
       System.out.println(FilaExemplo);
    }
}
