package tareas;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

import model.Pedido;
import service.PedidosService;
import service.PedidosServiceFactory;

public class HiloLlamada implements Runnable{
	Socket socket;
	public HiloLlamada(Socket socket) {
		this.socket=socket;
	}

	@Override
	public void run() {
		//para leer y escribir por el socket
		try(ObjectInputStream in=new ObjectInputStream(socket.getInputStream())){
				PedidosService service=PedidosServiceFactory.getPedidosService();
				Pedido pedido=(Pedido)in.readObject();
				System.out.println(pedido.getProducto()+"-"+pedido.getTienda());
				service.altaPedido(pedido);
		}
		catch(IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
	}

}
