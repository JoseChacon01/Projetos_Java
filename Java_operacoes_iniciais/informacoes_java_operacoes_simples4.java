public class Aula06 {
    public static void main(String[] args){
       /*
        Estruturas de Controle
        1 - Sequêncial <- Já viu!
        2 - Condicional
        3 - Repetição
        */
       
       /*
       Estruturas Condicionais
       - Alteram o fluxo do algoritmo de acordo
       com alguma condição
       IF
       IF...ELSE
       IF...ELSE ANINHADO
       */
       
       /*
       IF
       Executa 1 ou várias INSTRUÇÕES se
       uma determinada CONDIÇÃO for verdade!
       
       Ex.: Armazene um número inteiro em uma
       variável. Se o número armazenado for 0,
       imprima o texto: "Armazenou zero".
       */
       
       int numero = 0;
       
       if(numero == 0){
           System.out.println("Armazenou zero");
           System.out.println("Acertou");
       }
       
       /*
       Armazene um número inteiro em uma variável.
       Se o número for positivo, imprima o número
       armazenado.
       */
       
      int numero1 = 5;
       if(numero1 >0){
           System.out.println(numero1);
       }
       
       /*
       IF...ELSE
       Imprime 1 ou várias instruções caso uma 
       condição seja verdadeira (TRUE), ou
       imprime 1 ou várias outras instruções
       caso a condição seja falsa (FALSE)
       */
       
       /*
       Armazene um número em uma variável.
       Se o número for 0, imprima: "Armazenou zero"
       Se não for zero, imprima: "Não armazenou zero"
       */
       
       numero = 0;
       if(numero==0){
           System.out.println("Armazenou zero");
       }else{
           System.out.println("Não armazenou zero");
       }
       
       /*
       IF ELSE ANINHADO/ENCADEADO
       */
       
       /*
       Armazenar um número inteiro em uma variável.
       Se o número for zero, imprimir "NULO"; caso
       seja positivo, imprimir "POSITIVO". Por fim, 
       caso seja negativo, imprimir "NEGATIVO".
       */
       
       // Forma tradicional (menos eficiente)
       numero = 15;
       if(numero<0){
           System.out.println("NEGATIVO");
       }
       if(numero==0){
           System.out.println("NULO");
       }
       if(numero>0){
           System.out.println("POSITIVO");
       }
       
       numero = -13;
       // Forma encadeada
       if(numero<0){
           System.out.println("NEGATIVO");
       }else{
           if(numero==0){
               System.out.println("NULO");
           }else{
               System.out.println("POSITIVO");
           }
       }
       
       
       
       
       
    }
} 