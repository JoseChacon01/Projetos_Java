package lista4;

import java.util.Scanner;
public class ExercLista4_1 {
    public static void main(String[] args){
          Scanner in = new Scanner(System.in);
          int dia = 0;
          do{
              
            
          System.out.println("==INSIRA UM NUMERO CORRESPONDENTE AO DIA DA SEMANA==");
     
           System.out.println("1= SEGUNDA");
           System.out.println("2= TERÇA");
           System.out.println("3= QUARTA");
           System.out.println("4= QUINTA");
           System.out.println("5= SEXTA");
           System.out.println("6= SABADO");
           System.out.println("7= DOMINGO");
           System.out.println("0= PARAR PROGRAMA");
           
           
           
        dia = Integer.parseInt(in.nextLine());
        
       if(dia==1){
          System.out.print("SEGUNDA"); 
       }
       if(dia==2){
          System.out.print("TERÇA");
       }
       if(dia==3){
          System.out.print("QUARTA");
       }
       if(dia==4){
          System.out.print("QUINTA"); 
       }
       if(dia==5){
          System.out.print("SEXTA");
       }
       if(dia==6){
          System.out.print("SABADO");
       }
       if(dia==7){
          System.out.print("DOMINGO");
       }
               
                    
        }while(dia !=0);

}
}
