package service;

public class TiendaServiceFactory {
	public static ClienteService getClienteService() {
		return new ClienteServiceImpl();
	}
}
