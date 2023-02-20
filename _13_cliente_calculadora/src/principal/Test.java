package principal;

import service.Calculadora;

public class Test {

	public static void main(String[] args) {
		int n1=9;
		int n2=5;
		Calculadora cal=new Calculadora();
		System.out.println(cal.dividir(n1, n2));
	}

}
