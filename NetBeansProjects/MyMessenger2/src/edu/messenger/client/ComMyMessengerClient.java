package edu.messenger.client;

import java.time.LocalDateTime; //gg
import java.time.format.DateTimeFormatter; //gg

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComMyMessengerClient {

    private String serverIp = null;
    private String nickNameClient = null;
    private int serverPort = 7073;
    private Socket s = null;
    private DataInputStream in;
    private DataOutputStream out;

    public ComMyMessengerClient(String strIP, String nickNameClient) {
        this.serverIp = strIP;
        this.nickNameClient = nickNameClient;
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); //DATA E HORA DA CONEXÃO
        System.out.println(dtf.format(LocalDateTime.now()));
    }

    public void desconectar() {
        try {
            s.close();
        } catch (IOException ex) {
            Logger.getLogger(ComMyMessengerClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int conectar() {
        int erro = 0;

        try {
            s = new Socket(serverIp, serverPort);
            in = new DataInputStream(s.getInputStream());
            out = new DataOutputStream(s.getOutputStream());
            
            out.writeUTF(nickNameClient);

        } catch (UnknownHostException e) {
            System.out.println("Sock:" + e.getMessage());
            erro = 1;
        } catch (EOFException e) {
            System.out.println("EOF:" + e.getMessage());
            erro = 2;
        } catch (IOException e) {
            System.out.println("IO:" + e.getMessage());
            erro = 3;
        } finally {
            /*if (s != null) try {
                s.close();
            } catch (IOException e) {//close failed
                
            }*/
        }

        return erro;
    }

    public String getNickName() {
        return nickNameClient;
    }

    public int enviar(String msgClient) {
        int erro = 0;

        try {
            out.writeUTF(msgClient);
        } catch (IOException ex) {
            Logger.getLogger(ComMyMessengerClient.class.getName()).log(Level.SEVERE, null, ex);
            erro = 1;
        }

        return erro;
    }

}
