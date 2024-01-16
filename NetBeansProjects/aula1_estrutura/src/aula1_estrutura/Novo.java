
package aula1_estrutura;
import java.util.Stack; //Import da coleção Stack
public class Novo {

   public static void main(Integer[] args){
         
 // Padrão| Tipo de dados| Nome da pilha| Padrão
        Stack<Integer> p1 = new Stack<>();

//  Adicionando dados na pilha "carros" - utilisa o "Push"       
	  
	  p1.push(4);
          p1.push(3);
	  p1.push(2);
	  p1.push(1);
          
  //Imprimindo conteudo por conteudo da pilha
          for(Integer c: p1){
              System.out.println(c);
          }
                  
        /*  
	//System.out.println ("topo da pilha: " + carros.peek()); // "peek" Retorna o elemento que esta no topo da pilha, sem retiralo da pilha
	System.out.println("Topo da pilha: " + carros.pop());    // "pop" Retorna o elemento que esta no topo da pilha e retira-o da pilha
	System.out.println(carros); //Imprime o conteudo da pilha "carros"
	carros.clear();            // Esvazia a pilha
	System.out.println(carros.empty()?"Pilha vazia":"Pilha com elementos"); // "empty" Retorna se a pilha esta vazia ou não
        // if ternario                   ^             ^ caso contrario
        
        */ 
}
}
