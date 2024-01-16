
package lista06;
                                    //QUESTÃO 7
public class PessoaInst {
     public static void main(String[] args) {
       /*Pessoa p1 = new Pessoa();             //Formato 1 (Comentado)
       p1.nome = "João Carlos";
       p1.idade = 45;
       p1.cpf  = "444444444446";
       p1.status(); 
       
      System.out.println(" ");
       
        Pessoa p2 = new Pessoa();             
       p2.nome = "Felipe Silva";
       p2.idade = 28;
       p2.cpf  = "222222233326";
       p2.status(); */
       
       Pessoa p1 = new Pessoa("Felipe Costa", 22, "12111111211");  
       System.out.println(p1.toString());
       
        System.out.println(" ");
       
       Pessoa p2 = new Pessoa("João Pedro", 26, "34533445333");
       System.out.println(p2.toString());
    }
}
