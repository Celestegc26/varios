package _08_patron_singleton;

public class MiSingleton {
	private static MiSingleton instance;
	//unos cuantos métodos
	private MiSingleton() {
		
	}
	//todas las llamadas a getInstance devuelven el mismo y único objeto
	public static MiSingleton getInstance() {
		if(instance==null) {
			instance=new MiSingleton();
		}
		return instance;
	}
}
