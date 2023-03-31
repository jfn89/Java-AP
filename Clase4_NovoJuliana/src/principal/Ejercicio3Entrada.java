package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio3Entrada {
	String Path;
	public void ArcEntrada(String Ruta) {
		this.Path=Ruta;
	}	
	public String LeerArchivos() 
	{
		try {
			for (String linea : Files.readAllLines(Paths.get(Path)))
			{
				return linea;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
}
