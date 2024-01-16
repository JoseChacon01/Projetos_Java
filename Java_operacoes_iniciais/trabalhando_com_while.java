import java.util.Scanner;
public class Aula08_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*
        while
        Estrutura de repetição utilizada
        geralmente quando não sabemos
        a quantidade de repetições
        que irão acontecer
        
        Estrutura:
        while(condicao){}
        */
        
        /*
        Exemplo: imprimir IFRN 10 vezes
        */
        int i=1;
        
        while(i<=10){
            System.out.println("IFRN");
            i++;
        }
        
        
        /*
        Obs.: O importante é que a condição seja 
        verdade 10 vezes. no próximo exemplo,
        o i inicia com 21 e termina com 30
        */
        
        i=25;
        
        while(i<=30){
            System.out.println("IFRN");
            i++;
        }
        
        /*
        Obs2.: Se a primeira vez que entrar no while
        a condição já for falsa, ele não executa nada 
        (não repete nenhuma vez).
        Ex.: 25 não é menor que 10
        */
        
        i=25;
        
        while(i<=10){
            System.out.println("IFRN");
            i++;
        }
        
        /*
        Exemplo 2: Imprimir do número 1 até 10
        */
        
        i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        
        /*
        break
        continue
        */
        
        System.out.println("Utilizando BREAK:");
        i = 1;
        while(i<=10){
            if(i<=3){
                break;
            }
            System.out.println(i);
            i++;            
        }
        System.out.println("Utilizando CONTINUE:");
        i = 1;
        while(i<=10){
            if(i==3){
                i++;
                continue;    
            }
            System.out.println(i);
            i++;
        }
        
        
        /*
        Crie um algoritmo que fique pedindo para
        o usuário digitar um número positivo. Se
        ele digitar um número negativo, deverá
        parar de pedir para digitar.
        */
        System.out.println("Digite um número positivo");
        int numero = Integer.parseInt(in.nextLine());
        
        while(numero>=0){
            System.out.println("Digite um número positivo");
            numero = Integer.parseInt(in.nextLine());
        }
        
        
        /*
        ESTRUTURA DO..WHILE
        
        Executa primeiro o que estiver dentro
        da estrutura para depois testar a condição
        
        do{
            
        }while();
        */
        
        i=25;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        
        i=25;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
        
        
        
        /*
        Crie um algoritmo que fique pedindo para
        o usuário digitar um número positivo. Se
        ele digitar um número negativo, deverá
        parar de pedir para digitar.
        */
         int numeroDigitado;
        do{
            System.out.println("Q2: Digite um número Positivo");
            numeroDigitado = Integer.parseInt(in.nextLine());
        }while(numeroDigitado>=0);

    }
}
