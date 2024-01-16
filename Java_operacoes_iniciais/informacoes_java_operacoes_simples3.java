public class Aula5_2 {
    public static void main(String[] args){
        /*
        OPERADORES CONDICIONAIS
        Servem para realizar uma comparação/condição
        e RETORNAM VALOR LÓGICO
        
        == Compara se é igual
        != Compara se é diferente
        > Compara se é maior
        < Compara se é menor
        >= Compara se é maior OU igual
        <= Compara se é menor OU igual
        */
        
        System.out.println(10==4);
        System.out.println(10==10);
        System.out.println(10>4);
        System.out.println(10>10);
        System.out.println(10>=10);
        System.out.println(5<10);
        System.out.println(3<=1);
        
        int numero1 = 10;
        System.out.println(numero1 == 15);
        
        boolean resultado = numero1 == 15;
        
        
        /*
        OPERADORES LÓGICOS
        Faz uma comparação entre duas operações
        condicionais
        O RETORNO É UM VALOR LÓGICO
        
        && - E
        || - OU
        ! - NEGAÇÃO
        */
        
        System.out.println(3>4 && 4>2);
        System.out.println(3>4 || 4>2);
        System.out.println(!(5==5));
        
        /*
        Ex.: Armazene em uma variável um
        número inteiro qualquer. Se tiver 
        armazenado 0 (zero), imprima true;
        */
        
        int numero2 = 0;
        System.out.println(numero2 == 0);
        
    }
}