
package lista4;
import java.util.Scanner;
public class ListaExerc4_7 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            int i = 0; 
            int n1 = 0; 
            int n2 = 0;
            int resultado = 0;
            System.out.println("Digite o primeiro número");
            n1=sc.nextInt();
            System.out.println("digite o segundo número");
            n2=sc.nextInt();
            
            for(i=1;i<=n1;i++){
                resultado+= n2;
               System.out.printf(" %d*%d=%d",n1,n2,resultado);
            }
        }
    }
 