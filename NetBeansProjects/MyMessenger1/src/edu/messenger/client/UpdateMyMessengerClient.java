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

    }

    public void desconectar() {

    }

    public int conectar() {
        int erro = 0;

        return erro;
    }

    public void run() {
        //String msg;
 
    }
}
