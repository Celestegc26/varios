package p2;

import p1.ClaseA;

public class ClaseC extends ClaseA {
	public void metodoC() {
		this.z=9;	//Acceso a protected
	}
	public void otro() {
		ClaseA ca=new ClaseA();
		//ca.z=1;		//No
		this.z=2;	//Si
	}

}

class ClaseD {
	public void metodo() {
		ClaseA ca=new ClaseA();
	}
}
