package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("10.1.3.100", 8000);
		OutputStream os=socket.getOutputStream();
		PrintStream out=new PrintStream(os);
		out.println("un cuponsito porfi");
		BufferedReader bf=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println(bf.readLine());

	}

}
