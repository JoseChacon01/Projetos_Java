public class Aula05 {
    public static void main(String[] args){
        /*
        REVISANDO: OPERADORES ARITMÉTICOS
        + soma
        - substração
        * multiplicação
        / divisãos
        */
        
        //Declarou e Inicializou na mesma linha
        int numero1 = 13;
        
        //Declarou
        int numero2;
        //Inicializou
        numero2 = 15;
        
        int resultado1 = numero1 + numero2;
        System.out.println(resultado1);
        
        
        /*
        Ex.: Salvar 2 notas inteiras, calcular a média
        e, por fim, imprimir o resultado encontrado.
        */
        
        int nota1 = 10;
        int nota2 = 8;
        
        // Primeira solução
        int soma = nota1+nota2;
        int media = soma/2;
        System.out.println(media);
        
        // Segunda solução
        int resultado = (nota1+nota2)/2;
        System.out.println(resultado);
        
        /*
        Na programação, existe a precedência de
        operadores, assim como na matemática
        / * são realizados primeiro (da esq. p/ a dir)
        + - São realizados posteriormente (da esq. p/ a dir)
        */
        
        int resultado2 = 8 + 4 / 2 * 2;
        System.out.println(resultado2);
        
        /*
        Ex.: Armazene um número inteiro que desejar
        em uma variável, e logo depois imprima
        30% do número armazenado!
        */
        
        int valor = 500;
        int resultado3 = valor * 30 / 100;
        System.out.println(resultado3);
        
        /*
        TIPOS DE DADOS REAIS
        double   <- VAMOS USAR ESTE
        
        Na linguagem, números reais (com casas 
        decimais) a , (vírgula) deve ser substituída
        por . (ponto)
        
        Ex.: 10,5 - 10.5
        */
        
        double distancia  = 10.5;
        double nota3 = 8.45;
        
        // Retomando o exemplo da %
        double preco = 500.00;
        
        // Possibilidade 1
        double resultado4 = preco * 30 / 100;
        
        // Possibilidade 2
        resultado4 = preco * 0.3;
        
        // Possibilidade 3
        double multiplicacao = preco * 30;
        resultado4 = multiplicacao / 100;
        
        
        /*
        Armazene seu salário em uma variável 
        real. Você acabou de ter um aumento 
        de 45%. Crie um agoritmo para calcular
        o seu novo salário de acordo com o 
        aumento obtido.

        Imprima:
        "Meu salário era R$ 3000,00 e agora
        com aumento de 45% ficou R$ 4350,00"
        */
        
        double salario = 3000.00;
        double aumento = salario * 45 / 100;
        double novoSalario = salario + aumento;
        
        double novoSalario2 = salario * 145 / 100;
        
        double novoSalario3 = salario * 1.45;
        
        System.out.println("Meu Salário era "+salario+" e com o aumento de 45% ficou "+novoSalario);
        
        /*
        TIPOS TEXTO
        char - Tipo Primitivo
        String - Tipo Objeto
        */
        
        char letra1 = 'a';
        char letra2 = 'B';
        char letra3 = '@';
        char letra4 = '-';
        char letra5 = '1';
        
        
        String frase = "Java é bom d+!";                
        
        System.out.println(frase);       
        
        /*
        Valor Lógico - verdadeiro ou falso
        boolean
        */
        
        boolean resultado10 = true;
        boolean resultado11 = false;
        
        System.out.println(resultado10);
   
    }
}