
package poo01;
public class Caneta {
    String modelo;      //Atributo 1 
    String cor;        //Atributo 2
    float ponta;      //Atributo 3
    int carga;       //Atributo 4
    boolean tampada;//Atributo 5
    
    void status() {
        System.out.println("Modelo da caneta:" + this.modelo);
        System.out.println("Uma caneta:" + this.cor); //Apresenta o status do objeto
                                                   // o This serve como uma altoreferencia para quem chamou o metodo status
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Qual a carga:" + this.carga);
        System.out.println("Esta tampada:" + this.tampada);
    }
    void rabiscar(){ //motodo 1
    if (this.tampada == true){
         System.out.println("Erro, não posso rabiscar!");
    } else {
         System.out.println("Estou rabiscando!");
    }
     }
    
    void tampar () { //motodo 2
        this.tampada=true;
    }
    
    void destampar (){ //motodo 3
        this.tampada=false;
    }
    
}
