/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.messenger.client;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import edu.messenger.desktop.MyMessengerClient;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ebertonsm
 */
public class UpdateMyMessengerClient extends Thread {

    private Socket sUpdate = null;
    private DataInputStream inUpdate = null;
    private String serverIp = null;
    private int serverPort = 7073;
    private MyMessengerClient clientForm = null;

    public UpdateMyMessengerClient(String strIP, MyMessengerClient clientForm) {
        this.serverIp = strIP;
        this.clientForm = clientForm;
    }

    public void desconectar() {
        try {
            sUpdate.close();
        } catch (IOException ex) {
            Logger.getLogger(UpdateMyMessengerClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int conectar() {
        int erro = 0;

        try {
            sUpdate = new Socket(serverIp, serverPort);
            inUpdate = new DataInputStream(sUpdate.getInputStream());

            start();
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
            /*if (sUpdate != null) try {
                sUpdate.close();
            } catch (IOException e) {//close failed
                
            }*/
        }

        return erro;
    }

    public void run() {
        //String msg;
        String nickName, msg;

        try {
            while (true) {
                System.out.println("Esperando Atualização");

                nickName = inUpdate.readUTF();
                msg = inUpdate.readUTF();
                System.out.println(nickName + "** "+ msg);
                clientForm.atualizarConversas(nickName, msg);
                System.out.println("Atualizando Conversa");
            }
        } catch (EOFException e) {
            System.out.println("EOF:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO:" + e.getMessage());
        }
    }
}
