package pacote_2;

import java.util.Stack;
import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> p1 = new Stack<>();
        Stack<Integer> p2 = new Stack<>();
        Stack<Integer> p3 = new Stack<>();
         
        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);
        
       
        
        int temp =p1.pop();
        p2.push(temp);
        p3.push(p1.pop());
        p2.push(p1.pop());
        temp=p1.pop();
        p3.push(temp);
        p1.push(p2.pop());
        p3.push(p2.pop());
        p3.push(p1.pop());
         
        System.out.println("PILHA 1: "+p1);
        System.out.println("PILHA 2: "+p2);
        System.out.println("PILHA 3: "+p3);
        
    }
}