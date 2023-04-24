package principal;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Pronostico {
	int puntos_usuario = 0;
	Partido partido_usuario = new Partido();
	Equipo equipo_usuario = new Equipo("", "");
	Resultado resultado_usuario;
	ArrayList<Partido> pronosticos = new ArrayList<>();
	
	public Pronostico() {

	}
	
		public ArrayList<Partido> leerArchivo_usuario(String archivo) {
			
			String equipo1, equipo2;
			File file = new File(archivo);
			
			try (Scanner fileScn = new Scanner(file, StandardCharsets.UTF_8)) {
				while (fileScn.hasNextLine()) {

					String[] vector = (fileScn.nextLine()).split(";");
					equipo1 = vector[0];
					equipo2 = vector[4];
					if (vector[1] != "") {
						resultado_usuario = Resultado.GANADOR;
					} else if (vector[2] != "") {
						resultado_usuario = Resultado.PERDEDOR;
					} else if (vector[3] != "") {
						resultado_usuario = Resultado.EMPATADO;
					}
						
					Equipo Equipo11 = new Equipo (equipo1,equipo1);
					Equipo Equipo22 = new Equipo (equipo2,equipo2);
										
					Partido pronostico = new Partido();
					pronostico.local = Equipo11;
					pronostico.visitante = Equipo22;
					pronostico.resultado = resultado_usuario;
					pronosticos.add(pronostico);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	
			return pronosticos;
		}
		
			
	public Equipo getEquipo_usuario() {
			return equipo_usuario;
		}

		public void setEquipo_usuario(Equipo equipo_usuario) {
			this.equipo_usuario = equipo_usuario;
		}

	public int puntos(boolean acierto) {
		if (acierto == true) {
			puntos_usuario++;
		}
		return puntos_usuario;
	}

}
