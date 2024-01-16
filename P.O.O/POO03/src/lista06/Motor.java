package lista06;
public class Motor {  //QUESTÃO 2
    int potencia; 
    
     public Motor(int potencia) {
            if (potencia<=100 && potencia >=1){
                this.potencia=potencia;
            }else{
                if(potencia<1){
                    this.potencia=1;
                }
                if(potencia >100){
                    this.potencia=100;
                }
            }
}
     
}
