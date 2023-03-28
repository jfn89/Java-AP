package principal;
import java.util.Arrays;
public class Main {
	
	public static void main(String[] args) {
		String palabra = "anana";
		char letra = 'a';
		int cantidad = Ejercicio1.contadorLetra(palabra, letra);
		System.out.println(cantidad);
		int [] ordenAscendente = Ejercicio1.ordenaNumeros(15,3,20,'a');
		for(int i : ordenAscendente) {
			System.out.println(i);
		}
		int [] ordenAsc = Ejercicio1.orden(15,3,20,'a');
		for(int i : ordenAsc) {
			System.out.println(i);
		}
		int [] ordenDescendente = Ejercicio1.ordenaNumeros(15,3,20,'d');
		for(int i : ordenDescendente) {
			System.out.println(i);
		}
		int [] ordenDesc = Ejercicio1.orden(15,3,20,'d');
		for(int i : ordenDesc) {
			System.out.println(i);
		}
		int[] numeros = { 1, 5, 3, 7, 2, 8 };
	    int x = 4;
	    int suma = Ejercicio1.sumarMayores(numeros, x);
	    System.out.println(suma);
	    String texto = "El maestro debe caminar con una legítima rabia, con una justa ira, con una indignación necesaria, buscando transformaciones sociales.\nPaulo Freire";
	    String codigo = Ejercicio2.codificar(texto, 2);
	    String decodificado = Ejercicio2.decodificar(codigo, 2);
	    System.out.println(codigo);
	    System.out.println(decodificado);	    
	}
}

