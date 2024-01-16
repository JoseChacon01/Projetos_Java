package aula1_estrutura;

public class Conta_1 {
     String nome;
     double saldo;
    
    public Conta_1(String nome) 
    {
        this.nome = nome;
        this.saldo = 0.0; //valor Inicial
    }
    
    public Double sacar(Double op_saque) 
    {
        this.saldo = this.saldo - op_saque;   //Operação de saque
        return this.saldo;     //Retorna o valor do saldo apos a operação
    }
    
    public Double depositar(Double op_depositar) 
    {
        this.saldo = this.saldo + op_depositar; //Operação de deposito
        return this.saldo;          //Retorna o valor do saldo apos a operação
    }
    
    public Double Saldo_consult()
    {
        return this.saldo;   //Retorna o saldo atual do cliente
    }
    
    public String Nome_usu()
    {
        return this.nome; //Retorna o nome do cliente
    }
    
    public void Nome_usu_alt(String alt_Nome)
    {
        this.nome = alt_Nome;
    }
}
