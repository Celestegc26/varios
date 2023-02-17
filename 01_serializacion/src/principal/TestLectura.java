package principal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.Curso;

public class TestLectura {

	public static void main(String[] args) {
		String url="C:\\Users\\manana\\Desktop\\ficheros\\curso.bin";
		try(FileInputStream fis= new FileInputStream(url);
			ObjectInputStream in=new ObjectInputStream(fis)){
			//Lectura del objeto
				Curso curso=(Curso)in.readObject();
				System.out.println("El curso es: " + curso.getNombre());
	
		}catch(IOException | ClassNotFoundException ex ) {
			ex.printStackTrace();
		}
	}
}
