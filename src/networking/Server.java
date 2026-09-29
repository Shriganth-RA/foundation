package networking;

import java.io.*;
import java.net.*;

public class Server {
	static void main() throws IOException {
		try (ServerSocket server = new ServerSocket(5000)) {
			Socket socket = server.accept();
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			System.out.println("Server started, waiting for client...");
			String message;
			while (!(message = dis.readUTF()).equals("End")) {
				System.out.println("Client: " + message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}