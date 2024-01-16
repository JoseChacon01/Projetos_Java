public class Aula4 {
    public static void main(String[] args){
        
        // Comentário de 1 linha
        
        /*
        Comentário de
        várias linhas
        Obs.: quantas linhas
        desejar
        */
        
        /*
        O compilador não leva
        em conta comentários, ele
        salta para o fim do comentário
        para continuar a compilação
        */
        
        
        // A instrução a seguir serve para imprimir
        System.out.println("Bem-vindos a aula 04");
        
        /*
        VARIÁVEIS
        É um mecanismo para armazenar
        temporariamente informações
        
        Obs.: As variáveis existem
        enquanto o programa está sendo
        executado!
        
        Obs2.: não utilizar caracteres especiais, espaço,
        acentos no nome da variável
        
        Obs3.: utilizar caracteres em minúsculo no nome
        da variável
        idade, resultado
        
        Obs4.: se precisar colocar mais de um nome no
        nome da variável, se faz assim:
        resultadoMedia, carroDeMao
        
        Ex.: Criando uma variável para
        número inteiro:
        */
        
        // DECLARAÇÃO
        byte idade;
        short classificacao;
        int numero;
        long resultado;
        
        // INICIALIZAR
        idade = 23;
        classificacao = 1005;
        numero = 10;
        resultado = 33333;
        
        /*
        Obs.: Java é FORTEMENTE TIPADA
        Sempre deve informar o tipo do dado
        que a variável irá armazenar!
        
        DECLARAÇÃO: criar a variável
        
        INICIALIZAÇÃO: serve para
        definir um valor inicial
        para a variável
        Obs.: utiliza o operador 
        de atribuição = (igual)
        */
        
        //DECLARAÇÃO
        int num;
        
        //INICIALIZAÇÃO
        num = 10;
        
        //ALTERANDO O VALOR
        num = 5;
        
        //IMPRIMINDO O VALOR DA VARIÁVEL
        System.out.println(num);
        System.out.println("num");
        
        /*
        Quando se coloca um nome sem aspas
        na impressão, o compilador e interpretador
        irá reconhecer como VARIÁVEL, e irão buscar
        o último valor armazenado nela
        */
        
        /*
        É possível declarar e inicializar uma
        variável na mesma linha
        */
        
        int distancia = 50;
        
        int distancia2 = 30, distancia3 = 20;
        
        System.out.println(distancia);
        System.out.println(distancia2);
        System.out.println(distancia3);
        
        /*
        Questão: Crie uma variável inteira e armazene a sua
        idade; Logo depois, imprima desta forma:
        "A idade armazenada é: VALOR"
        
        Ex.:Se eu armazenar 32
        "A idade armazenada é: 32"
        */
        
        int minhaIdade;
        minhaIdade = 33;
        
        System.out.print("A idade armazenada é: ");
        System.out.println(minhaIdade);
        
        /*
        OPERADOR DE CONCATENAÇÃO + (mais)
        Junta informações (podem ser de 
        tipos diferentes no código
        */
        
        System.out.println("A idade armazenada é: "+minhaIdade);
        
        System.out.println("A idade é " + minhaIdade + " anos");
        
        /*
        OPERADORES ARITMÉTICOS
        + soma
        - subtrai
        * multiplica
        / divide
        */
        
        int resultado2 = 5 + 3;
        System.out.println(resultado2);
        
        int numero1 = 10;
        int resultado3 = numero1 - 3;
        System.out.println(resultado3);
        
        int numero3 = 5;
        int numero4 = 3;
        int resultado4 = numero3 * numero4;
        System.out.println(resultado4);
        
        System.out.println(10 / 2);
        
    }
}