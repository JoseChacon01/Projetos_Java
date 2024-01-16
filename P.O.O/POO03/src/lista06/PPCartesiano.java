
package lista06;
public class PPCartesiano {  //QUESTÃO 4
   int coeixoX;
   int coeixoY; 

    public PPCartesiano(int coeixoX, int coeixoY) {
        this.coeixoX = coeixoX;
        this.coeixoY = coeixoY;
    }

   public class Triangulo {           //QUESTÃO 5

	private int vertc1;
	private int vertc2;
	private int vertc3;

    public Triangulo(int vertc1, int vertc2, int vertc3) {
        this.vertc1 = coeixoX + coeixoY;
        this.vertc2 = coeixoX + coeixoY;
        this.vertc3 = coeixoX + coeixoY;
    }

    public int getVertc1() {
        return vertc1;
    }

    public void setVertc1(int vertc1) {
        this.vertc1 = vertc1;
    }

    public int getVertc2() {
        return vertc2;
    }

    public void setVertc2(int vertc2) {
        this.vertc2 = vertc2;
    }

    public int getVertc3() {
        return vertc3;
    }

    public void setVertc3(int vertc3) {
        this.vertc3 = vertc3;
    }

    
    public Triangulo() {
        if(vertc1<vertc2+vertc3 && vertc2<vertc1+vertc3 && vertc3<vertc1+vertc2 ){
            System.out.println("PODEM FORMAR UM TRIANGULO!");
        }else{
            System.out.println("NÃO PODEM FORMAR UM TRIANGULO!");
        }
        }
	}
   }


