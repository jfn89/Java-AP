package principal;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Ronda {
	
	int numeroRonda;
	ArrayList <Partido> partidos = new ArrayList<>();
	
	public int getNro() {
		return numeroRonda;
	}

	public void setNro(int nro) {
		this.numeroRonda = nro;
	}
	
	public Ronda(int n) {
		this.numeroRonda = n;
	}
	
	public ArrayList<Partido> leerArchivo(String archivo) {
			
			String equipo1, equipo2;
			int golesEquipo1, golesEquipo2;
			File file = new File(archivo);
			
			try (Scanner fileScn = new Scanner(file, StandardCharsets.UTF_8)) {
	
				while (fileScn.hasNextLine()) {
	
					String[] vector = (fileScn.nextLine()).split(";");
					equipo1 = vector[0];
					equipo2 = vector[3];
					golesEquipo1 = Integer.parseInt(vector[1]);
					golesEquipo2 = Integer.parseInt(vector[2]);
					
					Equipo Equipo11 = new Equipo (equipo1,equipo1);
					Equipo Equipo22 = new Equipo (equipo2,equipo2);
					
					Partido partido = new Partido();
					partido.local = Equipo11;
					partido.visitante = Equipo22;
					partido.golesLocal = golesEquipo1;
					partido.golesVisita = golesEquipo2;
					partidos.add(partido);
	
				}
	
			} catch (IOException e) {
				e.printStackTrace();
	
			}
			
			return partidos;
		}
}
