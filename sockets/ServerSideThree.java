import java.io.*;
import java.net.*;

public class ServerSideThree {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Waiting for clients...");

            while (true) {
                Socket s = ss.accept();
                System.out.println("Client " + s.getPort() + " connected");

                ClientHandler handler = new ClientHandler(s);
                Thread thread = new Thread(handler);
                thread.start();
                ss.close();
            }

        } catch (IOException e) {
            System.out.println("Error:" + e);
        }
    }
}

class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream dataIn = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
            String msg = "";
            while (!msg.equals("over")) {
                msg = dataIn.readUTF();
                System.out.println("Client " + clientSocket.getPort() + ": " + msg);
            }
            dataIn.close();
            clientSocket.close();
        } catch (IOException e) {
            System.out.println("Error in client handler: " + e);
        }
    }

}
