import java.util.Scanner;

public class Aula08 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
       /*
        REVISÃO: Estruturas de Repetição
        Servem para repetir a execução de uma ou várias
        instruções
       */ 
       
       /*
       FOR
       É usada quando sabemos previamente
       quantas repetições irão acontecer
       
       for(inicialização; condicao_repeticao; incremento)
       */
       
       for(int i=1; i<=10; i++){
           System.out.println("IFRN");
       }
       
       for(int i=1; i<=10; i++){
           System.out.println(i);
       }
       
       /*
       Peça para o usuário digitar 2 números
       (o primeiro deve ser menor que o segundo).
       O programa deverá imprimir todos os números
       inteiros entre os digitados (incluindo eles).
       Ex. Se o usuário digitar 5 e 10, deverá imprimir:
       5 6 7 8 9 10
       */
       
       System.out.println("Digite o primeiro número");
       int numero1 = Integer.parseInt(in.nextLine());
       System.out.println("Digite o segundo número");
       int numero2 = Integer.parseInt(in.nextLine());
       
       for(int i=numero1; i<=numero2; i++){
           System.out.println(i);
       }
       
       
        /*
        Desafio:
        Imprima o resultado da soma 
        de todos os números no intervalo 
        entre 1 e 15
        (2+3+4+5...+14)
        Obs.: utilizar for
        */
        System.out.println("== DESAFIO ==");
        
        int soma=0;
        for(int i=2; i<=14; i++){
            soma = soma+i;
        }
        System.out.println("O resultado é: "+soma);
        
        /*
        Desafio:
        Imprima o resultado da multiplicação 
        de todos os números no intervalo 
        entre 1 e 15
        (2*3*4*5*...*14)
        Obs.: utilizar for
        */
        
        System.out.println("== DESAFIO 2 ==");
        
        int multiplicacao=1;
        for(int i=2; i<=14; i++){
            multiplicacao = multiplicacao*i;
        }
        System.out.println("O resultado é: "+multiplicacao);
        
    }
}
