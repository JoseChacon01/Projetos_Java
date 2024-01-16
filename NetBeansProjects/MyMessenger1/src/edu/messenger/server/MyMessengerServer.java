package edu.messenger.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyMessengerServer {

    public static void main(String[] args) {

        int serverPort = 7073;
        ServerSocket listenSocket = null;

        Socket clientSocket = null;
        //Socket clientScktUpdate = null;

        UserMyMessenger userMyMessenger = null;
        //UpdateMyMessengerServer updateMyMessengerServer = null;
        try {

            listenSocket = new ServerSocket(serverPort);
            //updateMyMessengerServer = new UpdateMyMessengerServer();

            while (true) {
                System.out.println("Esperando uma conexão.");
                clientSocket = listenSocket.accept();
                userMyMessenger = new UserMyMessenger(clientSocket);
                //userMyMessenger = new UserMyMessenger(clientSocket, updateMyMessengerServer);
                /*clientScktUpdate = listenSocket.accept();
                updateMyMessengerServer.add(clientScktUpdate);*/
                System.out.println("Criou um Socket");
            }

        } catch (IOException e) {
            System.out.println("Listen :" + e.getMessage());
        }
    }
}
