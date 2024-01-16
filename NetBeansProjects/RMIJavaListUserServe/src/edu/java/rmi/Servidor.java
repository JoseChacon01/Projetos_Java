package edu.java.rmi;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.server.*;
import java.rmi.*;
import java.util.HashMap;

public class Servidor extends UnicastRemoteObject implements Servico{
 
    HashMap<String,String> usuarios = new HashMap<>();
    
    
    
    public Servidor() throws RemoteException {
        super();
    }
    
    @Override
    public boolean autenticarUsuario(String login, String senha){
       if (this.usuarios.containsKey(login) && this.usuarios.get(login).equals(senha)){
           return true;           
       }
        return false; 
}

    @Override
    public HashMap<String, String>listaUsuarios() throws RemoteException {
        return this.usuarios;
    }

    @Override
    public boolean adicionarUsuario(String login, String senha){
        if (login.equals("") || senha.equals("")){
            return false;
        }
        this.usuarios.put(login, senha);
        return true;
    }


    
    public static void main(String[] args) {
        try {
            Servidor servidor = new Servidor();
            String localizacao = "//localhost/servico";
            Naming.rebind(localizacao, servidor);
            System.out.println("Servidor Iniciando!");
        } catch (RemoteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
