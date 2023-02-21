package p1;

public class ClaseB extends ClaseA {
	public void metodoB() {
		this.y=10; 	//Acceso al ambito de paquete
		this.z=3;	//Acceso al protected
	}
}
