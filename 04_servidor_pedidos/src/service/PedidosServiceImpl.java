package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import model.Pedido;
import service.locator.ConnectionLocator;

public class PedidosServiceImpl implements PedidosService {

	@Override
	public void altaPedido(Pedido pedido) {
		System.out.println("Estoy en el Service para el alta del pedido");
		try(Connection con=ConnectionLocator.getConnection();){
				String sql="insert into pedidos(producto,unidades,fecha,tienda) values(?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, pedido.getProducto());
				ps.setInt(2, pedido.getUnidades());
				ps.setDate(3, Date.valueOf(LocalDate.now()));
				ps.setString(4, pedido.getTienda());
				ps.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
