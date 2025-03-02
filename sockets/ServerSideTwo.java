import java.io.*;
import java.net.*;

public class ServerSideTwo{
	public static void main(String[] args){
		
		try{
			ServerSocket ss = new ServerSocket(6666);
			
			System.out.println("Waiting for a client...");
			
				Socket s = ss.accept();
				System.out.println("Client connected");
			DataInputStream dataIn = new DataInputStream(
			new BufferedInputStream(s.getInputStream()));

			String msg = "";
			
			while(!msg.equals("over")){
				msg = dataIn.readUTF();
				System.out.println("Client: " + msg);
			}
		
			ss.close();
			s.close();
			dataIn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
}
