import java.util.Scanner;

public class Aula7 {
    public static void main(String[] args){

        /*
            Para leitura de dados, utilizamos
            a classe Scanner.
            Ela precisa ser importada (1ª linha)
        */
        Scanner sc = new Scanner(System.in);
            
        /*
        O método nextLine() serve para ler o texto
        digitado no terminal
        */
        
        // Lendo Texto
        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();
        System.out.println("Nome Digitado: "+nome);
        
        // Lendo número inteiro
        System.out.println("Digite um número: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("Número Digitado: "+numero);
        
        // Lendo número real
        System.out.println("Digite o valor do mouse:");
        double valor = Double.parseDouble(sc.nextLine());
        System.out.println("O valor digitado foi: "+valor);
        
        
        
        System.out.println("====== DOBRO ======");
        System.out.println("Bem-vindo ao programa do dobro!");
        System.out.println("Digite um número para descobrir o seu dobro:");
        numero = Integer.parseInt(sc.nextLine());
        int dobro = 2 * numero;
        System.out.println("O dobro do número digitado é: "+dobro);
        
        /*
        Peça para o usuário digitar 2 notas (valores reais);
        Logo em seguida, o programa deverá calcular a média entre
        as notas e imprimir:
        "APROVADO" se a média for maior ou igual a 6
        "RECUPERAÇÃO" se a média for menor que 6
        */
        
        System.out.println("Digite a sua primeira nota:");
        double nota1 = Double.parseDouble(sc.nextLine());
        
        System.out.println("Digite a sua segunda nota:");
        double nota2 = Double.parseDouble(sc.nextLine());
        
        double media = (nota1+nota2)/2;
        
        if(media>=6){
            System.out.println("APROVADO");
        }else{
            System.out.println("RECUPERAÇÃO");
        }
        
        
        /*
        Peça para o usuário digitar 2 notas (valores reais);
        Logo em seguida, o programa deverá calcular a média entre
        as notas e imprimir:
        "APROVADO" se a média for maior ou igual a 6
        "RECUPERAÇÃO" se a média for maior ou igual a 3 e menor que 6
        "REPROVADO" se a média for menor que 3
        */
        
        System.out.println("Digite a sua primeira nota:");
        nota1 = Double.parseDouble(sc.nextLine());
        
        System.out.println("Digite a sua segunda nota:");
        nota2 = Double.parseDouble(sc.nextLine());
        
        media = (nota1+nota2)/2;
        
        //Possibilidade 1 (usando chaves)
        if(media>=6){
            System.out.println("APROVADO");
        }else{
            if(media>=3 && media<6){
                System.out.println("RECUPERAÇÃO");
            }else{
                System.out.println("REPROVADO");
            }
        }
        
        // Possibilidade 2 (sem chaves)
        if(media>=6)
            System.out.println("APROVADO");
        else
            if(media>=3 && media<6)
                System.out.println("RECUPERAÇÃO");
            else
                System.out.println("REPROVADO");
        
        
        // Possibilidade 3 (else if)
        if(media>=6)
            System.out.println("APROVADO");
        else if(media>=3 && media<6)
                System.out.println("RECUPERAÇÃO");
            else
                System.out.println("REPROVADO");
            

    }
}
