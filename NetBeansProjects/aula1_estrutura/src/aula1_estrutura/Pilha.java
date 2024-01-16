package aula1_estrutura;
public class Pilha {
    
    //CRIAÇÃO DA PILHA
    public Object[] pilha; //Tipo Object armazena letras ou numeros de uma forma mais generica
    public int posicaoPilha;
    
    public Pilha(){
        this.posicaoPilha = -1; // Controla a posição da pilha - se ja esta cheia não pode mais incluir
        this.pilha = new Object [1000]; 
    }
    
    public boolean pilhaVazia(){ 
        if (this.posicaoPilha == -1){ //Indica que a pilha esta vazia
            return true;
        }
        return false;
    }
    
    public int tamanho(){ 
        if (this.pilhaVazia()){ //Se a pilha esta vazia - retorne true da função pilhavazia()
            
            return 0;
        }
        return this.posicaoPilha + 1; //Acrescenta 1 na posiçãoda pilha
    }
    
    public Object exibeUltimoValor(){
        if (this.pilhaVazia()){
            return null;
        }
    }
    
    //DESEMPILHAR -POP
    public Object desempilhar(){
        if (pilhaVazia()){
            return null;
        }
        return this.pilha [this.posicaoPilha--];
    }
    
    //O EMPILHAMENTO - PUSH
    public void empilhar (Object valor){
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
            
        }
    }
    
    public static void main (String args []){
        Pilha p = new Pilha();
        p.empilhar ("Portuguesa");
        p.empilhar ("Frango");
        p.empilhar("Calabresa");
        p.empilhar("Quatro Queijos");
        p.empilhar("A moda da casa");
        while (p.pilhaVazia() == false){
            System.out.println(p.desempilhar());
        }
    }
}
