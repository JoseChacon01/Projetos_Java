
package lista06;      //questão 6
public class Pessoa {
    /*String nome;            
    int idade;                                      //Formato 1 (comentado)
    String cpf; 
    
        void status(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("CPF: "+this.cpf);
      }*/
    
    private String nome;           
    private int idade;                          //Formato 2
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override //Sig. Sobrescrever
    public String toString() {
        return "\nNome:" + nome + "\nIdade:" + idade + "\nCPF:" + cpf ;
    }
    
    
    
    }
    
