package projudp2;
        
import java.net.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
        
public class RemetenteUDP {
     public static void main(String[] args) {
  
      for(int i=2; i > 1; i++){
      Scanner sc = new Scanner(System.in);
      System.out.println("");
      System.out.println("Digite a mensagem a ser enviada: ");
      String mensagem = sc.nextLine();
      String ip = "127.0.0.1";
      int port = 1010;
      try {
        //Primeiro argumento é o nome do host destino
        InetAddress addr = InetAddress.getByName(ip);
        byte[] msg = mensagem.getBytes();
        //Monta o pacote a ser enviado
        DatagramPacket pkg = new DatagramPacket(msg,msg.length, addr, port);
        // Cria o DatagramSocket que será responsável por enviar a mensagem
        DatagramSocket ds = new DatagramSocket();
        //Envia a mensagem
        ds.send(pkg);
        System.out.println("Mensagem enviada para: " + addr.getHostAddress() + "\n" +
          "Porta: " + port + "\n" + "Mensagem: " + mensagem);
  
        //Fecha o DatagramSocket
        ds.close();
      }
  
      catch(IOException ioe) {}
    }
  }
}
