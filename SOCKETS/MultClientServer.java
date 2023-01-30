package leonteqsecurity.SOCKETS;

import java.io.*;
import java.net.*;

public class MultClientServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9090);

        while (true) {
            Socket client = server.accept();
            System.out.println("Client connected from: " + client.getInetAddress());
            new Thread(() -> {
                try {
                    handleClient(client);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    private static void handleClient(Socket client) throws IOException {
        InputStream input = client.getInputStream();
        OutputStream output = client.getOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead = input.read(buffer);

        while (bytesRead != -1) {
            output.write(buffer, 0, bytesRead);
            bytesRead = input.read(buffer);
        }
        client.close();
    }
}
