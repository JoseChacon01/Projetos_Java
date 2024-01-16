package aula1_estrutura;
import java.util.Scanner;
public class Questao_prova_p1 {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    TesteRecursivo b = new TesteRecursivo ();
    
   System.out.print ("Digite o numero: ");
   int n = sc.nextInt();
   
   System.out.print ("Elemento:" + b.testeRecursivoOrder (n));
    
}
}