public class Aula09_2 {
    public static void main(String[] args){
        /*
        Revisão de Repetição
        
        while e do...while
        */
        
        /*
        while
        Utilizado principalmente quando não
        se sabe previamente quantas repetições
        irão ocorrer
        */
        // i++ é a mesma coisa que i=i+1;
        
        int i = 15;
        
        while(i<=10){
            System.out.println(i);
            i++; 
        }
        
        // do...while
        
        i = 15;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
        
        
        
    }
}