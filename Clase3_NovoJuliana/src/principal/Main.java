package principal;
public class Main {
	
	public static void main(String[] args) {
		String palabra = "anana";
		char letra = 'a';
		int cantidad = Ejercicio1.contadorLetra(palabra, letra);
		System.out.println(cantidad);
		int [] ordenAscendente = Ejercicio1.ordenaNumeros(15,3,20,'a');
		System.out.println(ordenAscendente);
		int [] ordenAsc = Ejercicio1.orden(15,3,20,'a');
		System.out.println(ordenAsc);
		int[] numeros = { 1, 5, 3, 7, 2, 8 };
	    int x = 4;
	    int suma = Ejercicio1.sumarMayores(numeros, x);
	    System.out.println(suma);
	}
}
