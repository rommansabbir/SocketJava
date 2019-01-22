import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket1 = serverSocket.accept();
            System.out.println("Server: Connected");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
