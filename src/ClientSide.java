import java.io.IOException;
import java.net.Socket;

public class ClientSide {

    public static void main(String[] args) {
        final String ADDRESS = "127.0.0.1";
        final int PORT = 9999;


        try {
            Socket socket = new Socket(ADDRESS, PORT);
            System.out.println("Client: Connected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
