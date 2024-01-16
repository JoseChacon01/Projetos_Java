
package aula1_estrutura;
import java.util.Stack; //Import da coleção Stack
public class Ex_Pilha_1 {

   public static void main(String[] args){
         
 // Padrão| Tipo de dados| Nome da pilha| Padrão
        Stack<String> carros = new Stack<>();

//  Adicionando dados na pilha "carros" - utilisa o "Push"       
	  carros.push("HRV");
	  carros.push("GOLF");
          carros.push("POLO");
	  carros.push("CAMARO");
	  carros.push("UNO");
          
 /* //Imprimindo conteudo por conteudo da pilha
          for(String c: carros){
              System.out.println(c);
          }
          */         
          
	//System.out.println ("topo da pilha: " + carros.peek()); // "peek" Retorna o elemento que esta no topo da pilha, sem retiralo da pilha
	System.out.println("Topo da pilha: " + carros.pop());    // "pop" Retorna o elemento que esta no topo da pilha e retira-o da pilha
	System.out.println(carros); //Imprime o conteudo da pilha "carros"
	carros.clear();            // Esvazia a pilha
	System.out.println(carros.empty()?"Pilha vazia":"Pilha com elementos"); // "empty" Retorna se a pilha esta vazia ou não
        // if ternario                   ^             ^ caso contrario
        
        
}
}
