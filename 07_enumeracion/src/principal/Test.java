package principal;

import model.DiaSemana;
import model.Tienda;

public class Test {

	public static void main(String[] args) {
		//Crear una tienda con día de cierre el jueves
		var tienda=new Tienda("t1", "aaaa", DiaSemana.Jueves);
		//muestra mensaje distinto en función del dia de cierre
		switch(tienda.getDiaCierre()) {
			case Lunes:
			case Domingo:
		}
	}

}
