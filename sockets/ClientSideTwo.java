import java.io.*;
import java.net.*;

public class ClientSideTwo{
	public static void main(String[] args){
		try{
			Socket s = new Socket("localhost", 6666);
			
			DataInputStream dataIn = new DataInputStream(System.in);
			
			DataOutputStream dataOut = new DataOutputStream(s.getOutputStream());
		
			String msg = "";

			while(!msg.equals("over")){
				msg = dataIn.readLine();
				dataOut.writeUTF(msg);
			}

			dataIn.close();
			dataOut.close();
			s.close();
			
		}
		catch(Exception e){
			System.out.println(e);
		}

		
	}
}
