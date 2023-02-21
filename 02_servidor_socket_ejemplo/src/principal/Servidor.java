package principal;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tareas.HiloLlamada;

public class Servidor {

	public static void main(String[] args) throws IOException {
		ServerSocket server= new ServerSocket(8000);
		ExecutorService executor=Executors.newCachedThreadPool();
		System.out.println("Esperando llamadas...");
		while(true) {
			Socket socket=server.accept();
			System.out.println("Llamada recibida!");
			//Lancamos un hilo para atender la llamada
			executor.submit(new HiloLlamada(socket));
		}
	}

}
