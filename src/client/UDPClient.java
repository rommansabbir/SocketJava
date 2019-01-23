package client;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            byte[] data = "This is a test message from client".getBytes();

            InetAddress ip = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            DatagramPacket datagramPacket = new DatagramPacket(data, data.length, ip, port);
            datagramSocket.send(datagramPacket);

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
