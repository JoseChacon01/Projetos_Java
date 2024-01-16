
package lista06;       //PRECISA CRIAR UMA CLASS PILOTO NESSE PACOTE PARA NÃO DAR MAIS ERRO!!
public class CarroCorrida {
    //Estado

    private Integer numeroIdentificacao = 0;
    private Boolean estaLigado = false;
    private Double velocidadeAtual = 0.0;
    private Double velocidadeMaxima = 100.0;
    private Piloto piloto;
    private int Motor;

    public int getMotor() {
        return Motor;
    }

    public void setMotor(int Motor) {
        this.Motor = Motor;
    }

//Comportamento...
    public CarroCorrida(Integer numeroIdentificacao, Double velocidadeMaxima) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public CarroCorrida(double velocidadeMaxima) {      //QUESTÃO 1
        this.velocidadeMaxima = velocidadeMaxima;
    }


    public Integer getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(Integer numeroIdentificacao) {
        if (this.numeroIdentificacao == 0) {
            this.numeroIdentificacao = numeroIdentificacao;
        }
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    void ligar() {
        System.out.println("VRUUUMmmmmmmmmm");
        estaLigado = true;
    }

    void desligar() {
        System.out.println("MMMmmmm......");
        estaLigado = false;
    }

    /*void acelerar() {
        if (estaLigado) {
            velocidadeAtual += 10 + piloto.getHabilidade() * 0.1;
            if (velocidadeAtual > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
            }
        } else {
            System.out.println("O carro está desligado.");
        }
==COMO ESTAVA==
    }*/
    
    void acelerar() {
        if (estaLigado) {                                          // QUESTÃO3
            velocidadeAtual += 10; 
            velocidadeAtual = velocidadeMaxima + 0.1 * potencia;
            if (velocidadeAtual > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
            }
        } else {
            System.out.println("O carro está ");
        }
//==ALTERADO==
    }

    void frear(Integer intensidadeFreada) {
        if (intensidadeFreada > 100) {
            intensidadeFreada = 100;
        } else if (intensidadeFreada < 0) {
            intensidadeFreada = 0;
        }
        velocidadeAtual -= intensidadeFreada * 0.25;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0.0;
        }
    }

}

 
