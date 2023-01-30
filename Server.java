package leonteqsecurity.SOCKETS;
import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
//			creating a new socket so as the client can connect
			ServerSocket server = new ServerSocket(8000);
			System.out.println("Server started on port 8000");
//			waiting for the client to connect
			Socket client=server.accept();
//			getting the out put and input streams
			InputStream input=client.getInputStream();
			OutputStream output=client.getOutputStream();
//			sending message to the client 
			output.write("hello clien i am the server".getBytes());
			client.close();			
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}

