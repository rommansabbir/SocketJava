package client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientSide {

    public static void main(String[] args) {
        final String ADDRESS = "127.0.0.1";
        final int PORT = 9999;


        try {
            Socket socket = new Socket(ADDRESS, PORT);
            System.out.println("Client: Connected");

            //get a simple response from server
            getResponse(socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getResponse(Socket socket){
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(socket.getInputStream());
            String message = dataInputStream.readUTF();
            System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
