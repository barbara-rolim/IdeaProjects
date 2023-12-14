package ConcurrentChat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheoryServer {
    List<ClientHandler> clientHandlerList;

    public static void main(String[] args) throws IOException {
        TheoryServer theoryServer = new TheoryServer();
        theoryServer.start(8085);
    }

    private void start(int port) throws IOException {
        clientHandlerList = new LinkedList<>();
        ServerSocket serverSocket = new ServerSocket(port);
        ExecutorService executorService = Executors.newCachedThreadPool();
        while (true) {
            System.out.println("Listening to connections");
            Socket socket = serverSocket.accept();
            ClientHandler clientHandler = new ClientHandler(socket);
            clientHandlerList.add(clientHandler);
            executorService.submit(clientHandler);

        }
    }

    private void sendClientsMessage(ClientHandler sender, String message) {
        clientHandlerList.stream().filter(clientHandler -> !clientHandler.equals(sender)).forEach(clientHandler -> clientHandler.writeMessage(message));
    }

    private void sendPrivateMessage(ClientHandler sender, String receiverName, String message) {
        for (ClientHandler receiver : clientHandlerList) {
            if (receiver.clientName.equals(receiverName)) {
                receiver.writeMessage(sender.clientName + ": " + message);
            }
        }
    }

    class ClientHandler implements Runnable {
        private Socket socket;
        BufferedReader in;
        private PrintWriter out;

        private String clientName;

        public ClientHandler(Socket socket) {
            this.socket = socket;
            try {
                out = new PrintWriter(socket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private String readMessage() {
            try {
                return in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private void sendMessage(String message) {
            sendClientsMessage(this, message);
        }

        private void writeMessage(String message) {
            out.println(message);
            //System.out.println("Choose a name");
        }

        private void askClientName() {
            writeMessage("Choose a name: ");
            clientName = readMessage();
        }

        @Override
        public void run() {
            System.out.println("Client Arrived");
            askClientName();
            sendMessage("Message: ");
            String messageFromClient;
            while (socket.isConnected()) {
                System.out.println("Waiting for client Message");
                messageFromClient = readMessage();//blocking
                if (messageFromClient.startsWith("/msg")) {
                    String name = messageFromClient.split(" ")[1];
                    String message = messageFromClient.substring(6 + name.length());
                    sendPrivateMessage(this, name, message);
                    continue;
                }
                System.out.println("Message from client: " + messageFromClient);
                sendMessage(this.clientName + ": " + messageFromClient);
            }
        }
    }
}

