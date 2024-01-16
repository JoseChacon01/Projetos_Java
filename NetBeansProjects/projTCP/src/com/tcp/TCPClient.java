
package com.tcp;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String strIP =null;
        String msg = null;
        
        int serverPort = 7896;
        
        Socket s = null;
        
        System.out.println("Digite o IP:");
        strIP = sc.nextLine();
        
        System.out.println("Digite a mensagem:");
        msg = sc.nextLine();
        
        try { 
            s = new Socket (strIP, serverPort);
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            
            out.writeUTF(msg);
            String data = in.readUTF();
            System.err.println("Receceivod: " + data);
            
        } catch (UnknownHostException e){
            
        } catch (EOFException e){
            
        } catch (IOException e){
            
        }finally {
            if (s != null) try {
                s.close();
                
            } catch (IOException e){
                
            }
        }
        
    } 
}
