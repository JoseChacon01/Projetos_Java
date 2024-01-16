package aula1_estrutura;
public class Carro {

        
      String marca; 
      String modelo; 
      int ano;
      double quilometragem1 = 0;
      String cor;
      
      
      
   /* public void andar(double km_carro1) { -> quando tem o voida não dá retorno
        
        this.quilometragem1 = km_carro1;
}*/
        public double andar(double km_carro1) {
        this.quilometragem1 = km_carro1;
        return this.quilometragem1;
}
        public double verkm (){
        return this.quilometragem1;
    }
    
    public static void main(String[] args) {
        Carro uno = new Carro();          // marca, modelo, ano, etc. vão ser atribuidos ao uno.
        System.out.println(uno.verkm());
        System.out.println(uno.andar(110));
    }
}
