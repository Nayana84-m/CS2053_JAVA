import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started. Waiting for client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String clientMsg = input.readLine();
            System.out.println("Client says: " + clientMsg);

            output.println("Hello Client, message received!");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}