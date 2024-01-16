package aula1_estrutura;
public class metod_calculadora {
     static double calculosoma ( double valor, double soma){
                double resultado1 = valor + soma; 
                return resultado1;
                
}
      static double calculosub ( double valor, double subtracao){
                double resultado2 = valor - subtracao;
                return resultado2;
                
}
      static double calculodivs ( double valor, double divisao){
          double resultado3 = valor / divisao;
           return resultado3;
}
       static double calculomultp ( double valor, double multp){
          
           if (multp == 0)
               return 0;
           
           return (valor + calculomultp (valor, multp-1));
      
      
}
}