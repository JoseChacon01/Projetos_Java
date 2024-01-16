package lista4;


public class ListaExerc4_4 {
    public static void main(String[] args){
    /*int soma_impar = 0;
    int mult_par = 0;
   
    for( int i=1; i<=30;i++) {  
//verifica se é par pegando o resto da divisão por dois
if(i%2==0){
mult_par = mult_par*i;

System.out.println(mult_par);
}
else
{
//se não é par.. É ímpar.
soma_impar = soma_impar +i;
System.out.println(soma_impar);
}

} */   
    
    long x = 0, par=0, impar=0;
long i, mp, si, totalPar;

for(i=0; i<30; i++){

if(i%2==0){

if(i>2){

par = par*i;

}

else{
par = i;
}
}

else{

impar = impar+i; //este deu certo: 225
}

}
System.out.println("Soma dos ímpares é: "+impar);
System.out.println("Multiplicação dos pares é: "+par);
}
}
