
package projudp2;

import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class ReceptorUDP {
    public static void main(String[] args) {
        
        
        
        
        for(int i=2; i > 1; i++){
        try {
          //Converte o argumento recebido para inteiro (numero da porta)
          int port = 1010;
          //Cria o DatagramSocket para aguardar mensagens, neste momento o método fica bloqueando
          //até o recebimente de uma mensagem
          DatagramSocket ds = new DatagramSocket(port);
          
          System.out.println("");
          System.out.println("Ouvindo a porta: " + port);
          //Preparando o buffer de recebimento da mensagem
          byte[] msg = new byte[256];
          //Prepara o pacote de dados
          DatagramPacket pkg = new DatagramPacket(msg, msg.length);
          //Recebimento da mensagem
          ds.receive(pkg);
          System.out.println("recebeu pacote");
        
          String str = new String(pkg.getData()).trim();
          System.out.println(str);
          ds.close();
        }
  
        catch(IOException ioe) {}
        
        }
      }
}
  

