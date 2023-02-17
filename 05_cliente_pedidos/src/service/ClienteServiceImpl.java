package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

import model.Pedido;
import service.locator.ConnectionLocator;

public class ClienteServiceImpl implements ClienteService {

	@Override
	public String nuevoPedido(Pedido pedido) {		
			System.out.println("Estoy en el Service del Cliente para el alta del pedido");
			String mensajeSalida="";
			try(Socket socket=ConnectionLocator.getSocket();
					ObjectOutputStream out= new ObjectOutputStream(socket.getOutputStream());){
				out.writeObject(pedido);
				System.out.println("El pedido ha sido guardado correctamente");
				BufferedReader bf=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				mensajeSalida=bf.readLine();
				
			}catch(IOException  ex) {
				ex.printStackTrace();
			}		
			return mensajeSalida;
	}	
}
