package lista3;


import java.util.Scanner;

public class Exerc3_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int numero =0;
        do {
        
        System.out.print("==QUAL TIPO DE MEDIA VOCÊ DESEJA CAUCULAR? ==");
         System.out.print("\n");
         
        System.out.println("01- Aritmética");
        System.out.println("02- Ponderada. Ponderação 3, 3, 4.");
        System.out.println("03- Harmônica");
        System.out.println("00- SAIR");
   
        
        double escolha = Integer.parseInt(in.nextLine());
        
        if (escolha == 01) {
                System.out.println("==CAUCULO DA MEDIA ARITMÉTICA!!==");
                System.out.println("Digite a primeira nota:");
                double notaMedArit1 = Integer.parseInt(in.nextLine());
                
                System.out.println("Digite a segunda nota nota:");
                double notaMedArit2 = Integer.parseInt(in.nextLine());
                
                System.out.println("Digite a terceira nota:");
                double notaMedArit3 = Integer.parseInt(in.nextLine());
                
                double somaNotasArit = notaMedArit1 + notaMedArit2 + notaMedArit3;
                
                System.out.println("Sua media aritmetica obtida atraves das três notas inseridas foi: " + somaNotasArit/3);
                
        } else {
         if (escolha == 02) {
                 System.out.print("==CAUCULO DA MEDIA ARITMÉTICA PONDERADA: ==");
        System.out.print("\n");
        
        System.out.println("Insira a primeira nota:");
        double notaMedPond1 = Integer.parseInt(in.nextLine());
         
         System.out.println("Insira a segunda nota:");
        double notaMedPond2 = Integer.parseInt(in.nextLine());
         
         System.out.println("Insira a terceira nota:");
        double notaMedPond3 = Integer.parseInt(in.nextLine());

        double pond1= 3;
        double pond2= 3;
        double pond3= 4;
        
        double mult = (notaMedPond1*pond1)+(notaMedPond2*pond2)+(notaMedPond3*pond3);
        
        double pondTotal = pond1+pond2+pond3;
        double mediaArit = mult/pondTotal;
         
          System.out.println("Sua media aritmética ponderada obtida atraves de suas três notas, foi: " + mediaArit);
        } else {
        if (escolha == 03) {
                System.out.println("==CAUCULO DA MEDIA HARMÓNICA=="); 
                
        System.out.println("Insira a primeira nota:");
        double notaMedHarm1 = Integer.parseInt(in.nextLine());
         
         System.out.println("Insira a segunda nota:");
        double notaMedHarm2 = Integer.parseInt(in.nextLine());
         
         System.out.println("Insira a terceira nota:");
        double notaMedHarm3 = Integer.parseInt(in.nextLine());
        
         double cauculo= 3/ (1/notaMedHarm1 + 1/notaMedHarm2 + 1/notaMedHarm3);
         
         System.out.println("Sua media harmónica obtida atraves de suas três notas, foi: " + cauculo);
                
        } else {
        if (escolha == 00) {
                System.out.println("FIM!");
        } else {
            System.out.println("NÚMERO INVÁLIDO");
                        
                    }
                }
            }
         }
       
        }while(numero !=0);
}
}