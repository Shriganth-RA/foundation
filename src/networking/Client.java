package networking;

import java.io.*;
import java.net.Socket;

public class Client {
    static void main() throws IOException {
        try (Socket socket = new Socket("127.0.0.1", 5000)) {
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Client is connected to the server...");
            String message;
            while (!(message = bis.readLine()).equals("End")) {
                dos.writeUTF(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
