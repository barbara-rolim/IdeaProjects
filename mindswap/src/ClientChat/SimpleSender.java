package ClientChat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SimpleSender {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Create a socket
        DatagramSocket socket = new DatagramSocket(8082);

        // Message and destination information
        InetAddress DestinyIPAddress = InetAddress.getByName("127.0.0.1");
        int port = 8080;

        // Create the packet
        String message = "Hello again";
        byte[] sendData = message.getBytes();


        while (true) {
            DatagramPacket packetToSend = new DatagramPacket(sendData, sendData.length, DestinyIPAddress, port);
            socket.send(packetToSend);

            byte[] receive = new byte[1024];
            DatagramPacket received = new DatagramPacket(receive, receive.length);
            socket.receive(received);
            String quote = new String(receive, 0, received.getLength());
            System.out.println(quote);
            Thread.sleep(1000);
        }
    }
}