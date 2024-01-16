package aula1_estrutura;

import java.util.Scanner;

public class Teste_1 {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Conta_1 c = new Conta_1("Teste");
        
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        c.Nome_usu_alt(nome);
        
        boolean active = true;
        
        do 
        {
            System.out.println("\n Usuario: " + c.Nome_usu());
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            int opt = sc.nextInt();
            switch(opt)
            {
                case 1: {
                    System.out.println("Digite o valor que deseja sacar");  
                    Double saque = sc.nextDouble(); 
                    c.sacar(saque);
                    System.out.println("Novo saldo: " + c.Saldo_consult()); //Retorna o saldo atual do cliente
                    break;
                }
                case 2:{
                    System.out.println("Digite o valor que deseja depositado"); // ''
                    Double deposito = sc.nextDouble();
                    c.depositar(deposito);
                    System.out.println("Novo saldo: " + c.Saldo_consult()); // ''
                    break;
                }
                case 3:{
                    System.out.println("Saldo: " + c.Saldo_consult()); // ''
                    break;
                }
                case 4:{
                    active = false;  //Opção de parada
                    break;
                }
            }
        } 
        while (active);
        
    }
    
}