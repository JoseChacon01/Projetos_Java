public class Aula07_2 {
    public static void main(String[] args){
        /*
        Como fazer para imprimir o texto 
        "IFRN" 5 vezes?
                
        System.out.println("IFRN");
        System.out.println("IFRN");
        System.out.println("IFRN");
        System.out.println("IFRN");
        System.out.println("IFRN");
        */

        
        /*
        Como fazer para imprimir o texto 
        "IFRN" 1000 vezes?
        
        Aí é bronca!
        */
        
        /*
        ESTRUTURAS DE REPETIÇÃO
        Servem para repetir algum tipo 
        de operação no seu algoritmo!
        
        Estruturas:
        FOR
        WHILE
        DO...WHILE
        */
        
        /*
        FOR
        É a estrutura que usamos quando sabemos
        previamente quantas repetições irão 
        acontecer
        
        for(inicialização; condição_repeticao; incremento)
        
        Obs.: O for utiliza uma variável de controle (ela
        é reponsável por controlar as repetições).
        */
        
        /*
        Ex.: Imprimir o texto "IFRN" 10 vezes!
        */
        
        for(int i=1; i<=10; i++){
            System.out.println("IFRN");
        }
            
        /*
        Dicas:
        Obs1.: i é a variável de controle
        Obs2.: a área de inicialização serve para inicializar
            a variável de controle
        Obs3.: leia assim a condição de repetição: "enquanto
            for verdade, repita"
        */
        
        /*
        Imprima de 1 até 30
        */
        
        for(int i=1; i<=30; i++){
            System.out.println(i);
        }
        
        /*
        Imprimir do 30 até 1
        */
        
        for(int i=30; i>=1; i--){
            System.out.println(i);
        }
        
        /*
        Imprimir de 2 até 30 de 2 em 2
        2 4 6 8 10....
        */
        
        for(int i=2; i<=30; i=i+2){
            System.out.println(i);
        }
        
        /*
        Dica: 
        i++ é a mesma coisa de i=i+1
        */
        
        
        /*
        Desafio:
        Imprima o resultado da soma 
        de todos os números no intervalo 
        entre 1 e 15
        (2+3+4+5...+14)
        Obs.: utilizar for
        */
        
        
        
        
        
        
        
        
        
        
    }
}