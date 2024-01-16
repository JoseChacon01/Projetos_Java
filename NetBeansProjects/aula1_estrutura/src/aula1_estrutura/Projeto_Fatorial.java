
package aula1_estrutura;
import java.util.Scanner;
public class Projeto_Fatorial {
public static void main(String []args){
    Scanner sc = new Scanner (System.in);  
    /* Fatorial b = new Fatorial ();
    System.out.println("Digite um numero para o calculo do fatorial:");
    int n = sc.nextInt();
    n = b.fatorialRecursivo(n);
    System.out.println("O fatorial é "+ n);*/
   
   
   //==================================================================================//
           
/*char N; Certo 2

System.out.println("introduza a letra:");
Scanner read = new Scanner(System.in);
N=read.nextLine().charAt(0);
if (N == 'A' || N == 'E' || N == 'I' || N == 'O' || N == 'U' ){

	System.out.println("a letra "+N+" é uma vogal");
}else{
	System.out.println("a letra "+N+ " é uma consoante");
 }*/

char n;
System.out.println("introduza a letra:");
n = sc.nextLine().charAt(0);

char num = recusividade(n);
System.out.println("É: "+num);

}

 public static char recusividade (char num){ 
        if (num == 'A' || num == 'E' || num == 'I' || num == 'O' || num == 'U' ){

	return 'v';
}else{
	 return 'C';
 }
 }
        
}
  
    

