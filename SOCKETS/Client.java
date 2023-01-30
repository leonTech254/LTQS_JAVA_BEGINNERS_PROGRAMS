package leonteqsecurity.SOCKETS;
import java.net.*;
import java.io.*;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Socket socket=new Socket("localhost",9090);
			System.out.println("Connected to the server");
//			getting the output and input stream
			InputStream input= socket.getInputStream();
			OutputStream output =socket.getOutputStream();
//			Reading the message from the server
			byte[] buffer=new byte[1024];
			int bytesRead=input.read(buffer);
			System.out.println("RECEIVED MESSAGE: "+ new String(buffer,0, bytesRead ));
//			closing the sockets
			socket.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}

	}

}
