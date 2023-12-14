package ClientChat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SimpleReceiver {
    public static void main(String[] args) throws IOException {

        //open a socket
        DatagramSocket socket = new DatagramSocket(8080);

        //prepare a package to receive data
        byte[] receivedData = new byte[1024];
        DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);

        while(!socket.isClosed()) {
            //wait until someone sends me a packet on port 8080
            socket.receive(receivedPacket); //blocking method

            System.out.println("After socket");
            //convert received bytes into a string
            String message = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
            System.out.println(message);

            InetAddress ipFromSender = receivedPacket.getAddress();
            int portFromSender = receivedPacket.getPort();
            byte[] reply = "My Responde".getBytes();

            DatagramPacket toSend = new DatagramPacket(reply, reply.length, ipFromSender, portFromSender);
            socket.send(toSend);
        }
        socket.close();
    }
}