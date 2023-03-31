package principal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class Ejercicio2 {
	public static void sumaNumeros(String Path) {	
		int Suma =0;
		String ArrayNum[]=new String[10];
		try {
			for (String linea : Files.readAllLines(Paths.get(Path))){
			 System.out.println("Los numeros en el archivo son =\n" + linea +"\n");
				ArrayNum = linea.split(",");
			}
			for(int i=0; i < ArrayNum.length;  i++){
				Suma += Integer.parseInt(ArrayNum[i]);	
				}
			System.out.println("La suma de estos numeros es: "+ Suma);
			}
		catch (IOException e) {
			e.printStackTrace();
		}
		}
	public static void operaNumeros(String Path, String TipoOp) {	
		int Suma =0;
		int multi=1;
		String ArrayNum[]=new String[10];
		try {
			for (String linea : Files.readAllLines(Paths.get(Path))){
			 System.out.println("Los numeros en el archivo son =\n" + linea +"\n");
				ArrayNum = linea.split(",");
			}
			for(int i=0; i < ArrayNum.length;  i++){
				if(TipoOp=="suma") {
				Suma += Integer.parseInt(ArrayNum[i]);
				}else {
					multi *= Integer.parseInt(ArrayNum[i]);};
			}
			if(TipoOp=="suma") {
			System.out.println("La suma de estos numeros es: "+ Suma);
			}else {
				System.out.println("La multiplicación de estos numeros es: "+ multi);};
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		}
		
}
