package aula1_estrutura;

import java.util.Stack;
import java.util.Scanner;

public class TestaPilha2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> p = new Stack<>();
        Stack<Integer> n = new Stack<>();
        int num = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o numero[" + i + "] ");
            num = in.nextInt();

            if (num > 0) {
                p.add(num);
            } else if (num < 0) {
                n.add(num);
            } else {
                if (!p.empty()) {
                    p.pop();
                }
                if (!n.empty()) {
                    n.pop();
                }
            }
        }

        System.out.println("Pilha dos positivos");
        for (Integer i : p) {
            System.out.println(i);
        }

        System.out.println("Pilha dos negativos");
        for (Integer i : n) {
            System.out.println(i);
        }
    }
}
