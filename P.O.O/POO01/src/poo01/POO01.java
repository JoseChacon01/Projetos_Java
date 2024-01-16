
package poo01;
public class POO01 {
    public static void main(String[] args) {
       Caneta c1 = new Caneta(); //Acabamos de instanciar a class caneta e criar o primeiro objeto (uma caneta) de no me "c1".
       c1.modelo = "fabricastel";
       c1.cor = "azul";
       c1.ponta  = 0.5f;
       c1.destampar(); // como esta tampada, não vai rabiscar.
       c1.rabiscar();
       c1.status(); // referencia a totodo, por isso tem "()" os outros a cima são ref. a atributos.
    
        System.out.println("==SEGUNDA CANETA C2==");
        
    //Agora iremos instaciar (criar) uma segunda caneta chamada c2
    Caneta c2 = new Caneta();
    c2.modelo="holist";
    c2.cor = "preta";
    c2.tampar(); 
    c2.status();
    c2.rabiscar();
    }
    
    
    
    
}
