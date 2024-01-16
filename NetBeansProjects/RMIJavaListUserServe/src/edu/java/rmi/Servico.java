package edu.java.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;


public interface Servico extends Remote {
    
    boolean autenticarUsuario (String login, String senha)throws RemoteException;
    HashMap<String, String> listaUsuarios() throws RemoteException;
    boolean adicionarUsuario(String login, String senha)throws RemoteException;
    
}
