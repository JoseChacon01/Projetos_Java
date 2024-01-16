
package aula1_estrutura;
import java.util.Scanner;
public class par_ou_impar {
public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        VetorOrdenado b = new VetorOrdenado(); //"VetorOrdenado" nome da class aux
        int vetor[] = new int[]{11,2,5,7,8};
        int ordenado[] = new int[5];
       //String n = sc.nextLine();   
        System.out.println("O vetor Inicial é ");
        for(int i=0; i<5; i++){
          System.out.println("i:  "+ i + " Elemento: "+ vetor[i]);   
        }
        
        b.organizaVetor(vetor, vetor.length,ordenado);
        
       // System.out.println("O vetor ordenado é: "+ b.organizaVetor(vetor, vetor.length,ordenado)); 
        
        for(int i=0; i<5; i++){
          System.out.println("i:  "+ i + " Elemento Ordenado: "+ ordenado[i]);   
        }
    }
}