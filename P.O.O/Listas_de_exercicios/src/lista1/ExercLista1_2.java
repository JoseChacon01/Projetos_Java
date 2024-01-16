package lista1;


public class ExercLista1_2 {
    public static void main(String[] args){
        
        int a = 10;
        int b = 20;
        int c = 5;
       
        int x = a + b;
        int y = b * c;
        int z = x*y;
        
         System.out.print("== Leia três valores em variáveis diferentes, variavel a= " + a+ ", " + "variavel b= " + b + " e " + "variavel c= " + c+". ==");
         System.out.print("\n");
         
         System.out.print("A soma das variaveis a + b = " + x + ", " + " dando origem a uma nova variavel = X, que sera equivalente a: "+ x );
         System.out.print("\n");
         
         System.out.print("O produto das duas ultimas variaves sera igual a: " + y +  " dando origem a uma nova variavel = Y, que sera equivalente a: "+ y);
          System.out.print("\n");
          
           System.out.print("O produto das duas novas variaveis X e Y, sera igual a: " + z + " dando origem a uma nova variavel = Z, que sera equivalente a: "+ z);
}
}