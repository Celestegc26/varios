package anidadas;

public class Externa {
	private void print() {
		System.out.println("Externa");
	}
	public void interno() {
		int b;
		class Local {
			private int c;
			public void printInterno() {
				//nos deja acceder a variables locales del método 
				//Siempre y cuando tengan valor fijo (Como si fueran constantes)
				System.out.println("Print interno");
			}
		}
		Local l= new Local();
		l.printInterno();
	}
}
