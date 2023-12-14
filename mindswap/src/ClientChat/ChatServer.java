package ClientChat;

import java.io.*;
import java.net.*;

public class ChatServer {
    private int portNumber;
    private String hostName;

    public ChatServer(int portNumber, String hostName) {
        this.portNumber = portNumber;
        this.hostName = hostName;
    }

    // Método para comunicação via UDP
    public void sendUDPMessage(String message) throws IOException {
        DatagramSocket socket = new DatagramSocket(portNumber);

        byte[] sendBuffer = new byte[1024];
        DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, InetAddress.getByName(hostName), portNumber);

        socket.send(sendPacket);
        socket.close();
    }

    public String receiveUDPMessage() throws IOException {
        DatagramSocket socket = new DatagramSocket(portNumber);

        byte[] recvBuffer = new byte[1024];
        DatagramPacket receivedPacket = new DatagramPacket(recvBuffer, recvBuffer.length);
        socket.receive(receivedPacket);

        socket.close();

        return new String(receivedPacket.getData(), 0, receivedPacket.getLength());
    }

    // Método para comunicação via TCP
    public void startTCPServer() throws IOException {
        ServerSocket serverSocket = new ServerSocket(portNumber);
        System.out.println("Servidor TCP aguardando conexões...");

        Socket clientSocket = serverSocket.accept(); // Bloqueante, aguarda conexão do cliente
        System.out.println("Cliente TCP conectado");

        // Configuração de fluxos de entrada e saída
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        // Exemplo de leitura de mensagem do cliente
        String clientMessage = in.readLine();
        System.out.println("Mensagem do cliente: " + clientMessage);

        // Exemplo de envio de mensagem para o cliente
        out.println("Olá, cliente!");

        // Fechar conexões
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }

    public static void main(String[] args) {
                // Defina a porta e o host conforme necessário
                int portNumber = 12345;
                String hostName = "localhost";

                // Crie uma instância do ChatServer
                ChatServer chatServer = new ChatServer(portNumber, hostName);

                try {
                    // Inicie o servidor TCP
                    chatServer.startTCPServer();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }