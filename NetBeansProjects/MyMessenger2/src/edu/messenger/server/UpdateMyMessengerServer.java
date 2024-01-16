/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.messenger.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author ebertonsm
 */
public class UpdateMyMessengerServer{

    private ArrayList<Socket> listaUsersMyMessenger;

    public UpdateMyMessengerServer() {
        listaUsersMyMessenger = new ArrayList<>();
    }

    public void add(Socket sct) {
        listaUsersMyMessenger.add(sct);
        System.out.println("Adicionou um Socket");
    }

    public void atualizar(String nickName, String msg) {
        DataOutputStream out;
        
        try {
            for (Socket j : listaUsersMyMessenger) {
                out = new DataOutputStream(j.getOutputStream());
                out.writeUTF(nickName);
                out.writeUTF(msg);
            }

        } catch (IOException e) {
            System.out.println("Connection:" + e.getMessage());
        }
    }

}
