import java.io.*;
import java.net.*;

public class ClientSideThree {
    public static void main(String[] args) {
        try {
            // Connect to the server running on localhost at port 6666
            Socket socket = new Socket("localhost", 6666);
            DataInputStream consoleIn = new DataInputStream(System.in);
            DataOutputStream dataOut = new DataOutputStream(socket.getOutputStream());
            
            String msg = "";
            // Send messages to the server until "over" is typed
            while (!msg.equals("over")) {
                msg = consoleIn.readLine();
                dataOut.writeUTF(msg);
            }
            
            consoleIn.close();
            dataOut.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Client error: " + e);
        }
    }
}
