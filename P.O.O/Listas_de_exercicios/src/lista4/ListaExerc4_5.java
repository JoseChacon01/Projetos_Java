package lista4;

public class ListaExerc4_5 {

    public static void main(String[] args) {

        int exte = 0;
        do {
            for (int i = 0; i <= 10; i = i + 1) {
                if (i> exte) {
                    break;
                }
                System.out.print(exte+" ");
                System.out.println(i);
               
            }

            exte++;
        } while (exte <= 10);

    }
}