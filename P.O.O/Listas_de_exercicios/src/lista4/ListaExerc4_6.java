package lista4;
import java.util.Scanner;

public class ListaExerc4_6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1;
        do {
            System.out.println("==DIGITE UM VALOR E DESCUBRA SE ELE É UM NÚMERO PRIMO==");
            int nPrimo = Integer.parseInt(in.nextLine());

            if (nPrimo == 2 || nPrimo == 3 || nPrimo == 5 || nPrimo == 7) {
                System.out.println(nPrimo + " esse é um número primo");
            } else {
                if (nPrimo % 2 == 0) {
                System.out.println(nPrimo + " esse não é um número primo");
            } else {
                if (nPrimo % 3 == 0) {
                System.out.println(nPrimo + " esse não é um número primo");
            } else {
                if (nPrimo % 5 == 0) {
                System.out.println(nPrimo + " esse não é um número primo");
            } else {
                if (nPrimo % 7 == 0) {
                System.out.println(nPrimo + " esse não é um número primo");
            } else {
                System.out.println(nPrimo + " esse é um número primo");
                         }
                  }
            }
       }
 }

            i++;
        } while (i >= 1);

    }
}
