import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            output.println("Hello Server, this is the Client!");
            System.out.println("Server says: " + input.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}