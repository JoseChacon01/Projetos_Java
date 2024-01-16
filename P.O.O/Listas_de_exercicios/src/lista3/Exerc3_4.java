package lista3;

public class Exerc3_4 {
     public static void main(String[] args){
         // entrada
         int hh_i, mm_i;
         int hh_f, mm_f;
         
         // saida
         int hh_s, mm_s;
         
         //processamento
         int duracao;
         
         hh_i = 14;
         mm_i = 0;
         
         hh_f = 15;
         mm_f = 30;
         
         duracao = (hh_f * 60 + mm_f)- (hh_i * 60 + mm_i);
         
         hh_s = duracao/60;
         mm_s = duracao % 60;
         
         System.out.printf("Duração: %d:%d",hh_s,mm_s);
}
}