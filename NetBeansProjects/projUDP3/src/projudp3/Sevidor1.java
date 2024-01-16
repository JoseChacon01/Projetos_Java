package projudp3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Sevidor1 {
    public static void main(String[] args){
        try {
            
            //Serviço de escuta criado:
      //Import_padrão/ será_o_servidor/ metodo_contrutor/ Porta_que_vai tá_escutando
            ServerSocket servidor = new ServerSocket(3334);
            System.out.println("Servidor iniciado na porta 3334");
            
            //Criamos o canal de comunicação para esse serviço
            // O servidor vai esta aceitando a conexão e inserindo-a dentro do objeto cliente.
            Socket cliente = servidor.accept();    //Vai pegar o IP de quem se conectou com esté servidor
            System.out.println("Cliente de IP: " + cliente.getInetAddress().getHostAddress());
            
            //canal de entrada
            Scanner entrada = new Scanner(cliente.getInputStream());
            
            //Enquanto a estrada estiver recebendo alguma informação, vai pegar essa entrada e printar na tela
            while(entrada.hasNextLine()){
                System.out.println(entrada.nextLine());
            }
            
            //Fechando o canal de entrada e o servidor
            entrada.close();
            servidor.close();
            
         //Se tudo estiver certo, o try sera executado, caso dê algum erro o "catch" será executado.   
        }catch (IOException ex){
            System.out.println("Erro ao criar servidor");
        }
    }
}
