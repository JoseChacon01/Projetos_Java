package com.udp;

// Importa a biblioteca com classes utilizadas para conexão entre processos
import java.net.*;
// Importa classes de entrada e saída de dados -> O pacote java.io contém o sistema de I/O original do Java. Nesse sistema, as operações de entrada e saída são realizadas com a utilização de fluxos ( streams ). Um fluxo é uma entidade associada a um dispositivo de I/O que enxerga esse dispositivo como uma sequência de bytes ou caracteres, que só podem ser lidos/escritos de forma sequencial.
import java.io.*;
// Scanner é um classe utilizada para ler informações a partir do teclado
import java.util.Scanner;

public class UDPClient {

    public static void main(String args[]) {
        
        for(int i=2; i > 1; i++){
        Scanner sc = new Scanner(System.in);
        // Guada a mensagem e o IP para onde a mensagem será enviada
        String msg = null;
        String strIP = null;
        
        System.out.println("");
        System.out.println("Digite uma mensagem:");
        msg = sc.nextLine();
        System.out.println("Digite o IP para envio da mensagem:");
        strIP = sc.nextLine();

        // Implementa uma classe para abstrair um Socket de Datagrama:  Este é um tipo de rede que possui conexão menos ponto para envio e recebimento de pacotes. É semelhante à caixa de correio. As cartas (dados) postadas na caixa são coletadas e entregues (transmitidas) para uma caixa de correio 
        DatagramSocket aSocket = null;
        try { // Como funciona o Try Catch: odo o código que apresenta a possibilidade de erros ou falhas é colocado em um bloco try. E o código a ser executado caso o erro ou falha aconteça é colocado em um bloco catch.
            // Cria um Socket do tipo Datagrama
            aSocket = new DatagramSocket();
            // Transforma o conteúdo do objeto em um conjunto de bytes para ser transmitido
            byte[] m = msg.getBytes();
            // Pega o endereço Internet a partir de um DNS hostname, http://www.ifrn.edu.br
            InetAddress aHost = InetAddress.getByName(strIP);
            // Porta do processo para onde será encaminhada a mensagem
            int serverPort = 1010; //6789
            // Cria um Datagrama com base nos parâmetros de entrada
            DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
            // Envia a mensagem através do Socket criado para o servidor
            aSocket.send(request);

            // Cria um buffer para armazenar a mensagem de retorno do servidor
            byte[] buffer = new byte[1000];
            // Datagrama criado para receber a mensagem do servidor
            DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
            // A mensagem do servidor é recebida através do Socket criado
            aSocket.receive(reply);
            System.out.println("Resposta: " + new String(reply.getData()));
        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        } finally {
            if (aSocket != null) {
                aSocket.close();
            }
        }
        }
    }
}
