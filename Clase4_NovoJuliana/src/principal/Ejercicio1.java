package principal;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	public static int[] ordenaNumeros(int nro1,int nro2,int nro3,char orden) {
		int numeros [] = {nro1,nro2,nro3};
		if(orden =='a') {
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
	
	public static int ingresoNumero() {
		Scanner miScanner = new Scanner(System.in);
		System.out.println("Por favor ingrese un número: ");
		int numero = miScanner.nextInt();
		return numero;
		}
	public static int ingresoChar() {
		Scanner miScanner = new Scanner(System.in);
		System.out.println("¿Cómo querés ordenarlos?\nPara orden ascendente ingresa a.\nPara orden descendente ingresa d.");
		char caracter = miScanner.next().charAt(0);
		return caracter;
		}	
	}

