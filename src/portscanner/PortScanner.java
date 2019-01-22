package portscanner;

import java.io.IOException;
import java.net.Socket;

public class PortScanner {

    public static void main(String[] args) {
        Socket socket;

        for (int i=1; i<9999; i++){
            try {
                socket = new Socket(args[0], i);
                System.out.println("Port Open: "+i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
