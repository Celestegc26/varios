package service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import model.Pedido;
import service.locator.ConnectionLocator;

public class ClienteServiceImpl implements ClienteService {

	@Override
	public void nuevoPedido(Pedido pedido) {		
			try(Socket soc=ConnectionLocator.getSocket();
				ObjectOutputStream out= new ObjectOutputStream(soc.getOutputStream());){
				out.writeObject(pedido);
				System.out.println("Pedido guardado");
				
			}catch(IOException  ex) {
				ex.printStackTrace();
			}		
	}	
}
