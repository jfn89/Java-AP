package principal;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Ronda ronda = new Ronda(1);	
		
		String archRonda1 = ".\\src\\principal\\archivos\\resultados.csv";
		
		ArrayList<Partido> partidos1 = ronda.leerArchivo(archRonda1);
		
		Pronostico pronosticos = new Pronostico ();
		
		String archPronostico1 = ".\\src\\principal\\archivos\\pronostico.csv";

		ArrayList<Partido> pronosticos1 = pronosticos.leerArchivo_usuario(archPronostico1);
		
		boolean acierto = false;
		
		System.out.println("Resultados Ronda " + ronda.numeroRonda + ": ");
		
			
		for (int i=0; i< partidos1.size(); i++) {
			System.out.println("\n" + partidos1.get(i).getLocal() +  " " + partidos1.get(i).getGolesLocal() + " - " + partidos1.get(i).getVisitante() + " " + partidos1.get(i).getGolesVisita());
			System.out.println("El usuario pronostico que " + pronosticos1.get(i).local.nombre + " seria " + pronosticos1.get(i).resultado);
			System.out.println("El equipo salio " + partidos1.get(i).Result(pronosticos1.get(i).local));
			
			if (pronosticos1.get(i).resultado == partidos1.get(i).Result(pronosticos1.get(i).local)) {
				acierto = true;
			} else {
				acierto = false;
			}
			
			System.out.println("Puntaje: " + pronosticos.puntos(acierto));
		}
		
		System.out.println("\n*******************");
		System.out.println("Puntaje total: " + pronosticos.puntos_usuario);

	}

}
