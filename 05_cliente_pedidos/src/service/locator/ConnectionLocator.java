package service.locator;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;

public class ConnectionLocator {
	
	public static Socket getSocket() throws UnknownHostException, IOException {
		Socket socket=new Socket("localhost", 8000);
		return socket;
	}
		
}
