package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio3Salida {
	String Txt;
	String Path;
	public void ArcSalida(String Texto, String Ruta) {
		this.Txt=Texto;
		this.Path=Ruta;
	}	
	public void ArcSalida() {}
	public void EscribirArchivos()
		{
			try {
				Files.writeString(Paths.get(Path), Txt);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
