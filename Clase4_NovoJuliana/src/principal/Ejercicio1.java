package principal;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	public static int[] ordenaNumeros(int nro1,int nro2,int nro3,char orden) {
		int numeros [] = {nro1,nro2,nro3};
		if(orden=='a') {
			Arrays.sort(numeros);
		}else {
			for (int i = 0; i< numeros.length-1; i++) {
				for(int j = i + 1; j<numeros.length;j++) {
					if(numeros[i]<numeros[j]) {
						int aux = numeros [i];
						numeros [i] = numeros [j];
						numeros [j] = aux;
					}
				}
			}
		}
		return numeros;
	}
	public static void main(String[] args) {
		//a.
		int [] ordenAscendente = Ejercicio1.ordenaNumeros(15,3,20,'a');
		int [] ordenDescendente = Ejercicio1.ordenaNumeros(15,3, 20, 'd');
		System.out.println(ordenAscendente);
		System.out.println(ordenDescendente);
		//b.
		Scanner miScanner = new Scanner(System.in);
		System.out.println("Por favor ingrese el primer número: ");
		int nro1 = miScanner.nextInt();
		System.out.println("Por favor ingrese el segundo número: ");
		int nro2 = miScanner.nextInt();
		System.out.println("Por favor ingrese el tercer número: ");
		int nro3 = miScanner.nextInt();
		System.out.println("¿Cómo querés ordenarlos?\nPara orden ascendente ingresa a.\nPara orden descendente ingresa d.");
		char orden = miScanner.next().charAt(0);
		int [] ordenUsuario = Ejercicio1.ordenaNumeros(nro1, nro2, nro3, orden);
		System.out.println(ordenUsuario);
		//c.
		
		miScanner.close();
	}

}
