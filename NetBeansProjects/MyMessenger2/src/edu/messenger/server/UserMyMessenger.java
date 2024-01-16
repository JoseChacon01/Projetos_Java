/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.messenger.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

class UserMyMessenger extends Thread {

    DataInputStream in = null;
    DataOutputStream out = null;
    Socket clientSocket = null;
    UpdateMyMessengerServer updateMyMessengerServer = null;
    String nickName = null;

    public UserMyMessenger(Socket aClientSocket) {
        try {
            clientSocket = aClientSocket;
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());
            this.start();
        } catch (IOException e) {
            System.out.println("Connection:" + e.getMessage());
        }
    }
    
    public UserMyMessenger(Socket aClientSocket, UpdateMyMessengerServer updateMyMessengerServer) {
        try {
            clientSocket = aClientSocket;
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());
            this.updateMyMessengerServer = updateMyMessengerServer;
            this.start();
        } catch (IOException e) {
            System.out.println("Connection:" + e.getMessage());
        }
    }

    public void run() {
        String msg;

        try { // an echo server
            nickName = in.readUTF();
            System.out.println("Leu: " + nickName);
            while (true) {
                msg = in.readUTF();
                System.out.println(nickName + ": " + msg);
                updateMyMessengerServer.atualizar(nickName, msg);

            }
        } catch (EOFException e) {
            System.out.println("EOF:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO:" + e.getMessage());
        }

    }
}
