package server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket1 = serverSocket.accept();
            System.out.println("Server: Connected");

            //send a simple response to client
            sendResponse(socket1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sendResponse(Socket socket){
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("This is a response from server");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
