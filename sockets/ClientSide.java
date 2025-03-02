import java.io.*;
import java.net.*;

public class ClientSide{
	public static void main(String[] args){
		try{

			//initializing Socket
			Socket s = new Socket("localhost", 6000);

			DataOutputStream d = new DataOutputStream(s.getOutputStream());

			d.writeUTF("Hello from client side");

			d.flush();

			d.close();

			s.close();

		}
		catch(Exception e){
			System.out.println("Error: " + e);
		}
	}
}
