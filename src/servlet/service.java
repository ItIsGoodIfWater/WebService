package servlet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class service {
	public static void main(String[] args) {
		ServerSocket serverSocket;
		DataInputStream dataInputStream = null;
		DataOutputStream dataOutputStream = null;

		while (true) {

			try {
				serverSocket = new ServerSocket(1234);
				System.out.println("服务端已经启动");
				Socket socket = serverSocket.accept();
				dataInputStream = new DataInputStream(socket.getInputStream());
				dataOutputStream = new DataOutputStream(socket.getOutputStream());

				String cityName = new UserDAO().toString();
				System.out.println("from client" + cityName);
				dataOutputStream.writeUTF(cityName);
			} catch (IOException ex) {
				//Logger.getLogger(WebserviceDemo_Socket.class.getName()).log(Level.SEVERE, null, ex);
			} finally {
				if (null != dataInputStream) {
					try {
						dataInputStream.close();
					} catch (IOException ex) {
						//Logger.getLogger(WebserviceDemo_Socket.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
				if (null != dataOutputStream) {
					try {
						dataOutputStream.close();
					} catch (IOException ex) {
						//sLogger.getLogger(WebserviceDemo_Socket.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
			}

		}
	}
}
