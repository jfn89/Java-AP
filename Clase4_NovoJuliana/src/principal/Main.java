package principal;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Ejercicio 1 
		//a.
		int [] ordenAscendente = Ejercicio1.ordenaNumeros(15,3,20,'a');
		int [] ordenDescendente = Ejercicio1.ordenaNumeros(15,3, 20, 'd');
		System.out.println(Arrays.toString(ordenAscendente));
		System.out.println(Arrays.toString(ordenDescendente));
		//b.
		Scanner miScanner = new Scanner(System.in);
		System.out.println("Por favor ingrese el primer número: ");
		int nro1 = miScanner.nextInt();
		System.out.println("Por favor ingrese el segundo número: ");
		int nro2 = miScanner.nextInt();
		System.out.println("Por favor ingrese el tercer número: ");
		int nro3 = miScanner.nextInt();
		System.out.println("¿Cómo querés ordenarlos?\nPara orden ascendente ingresa a.\nPara orden descendente ingresa d.");
		char ordenUs = miScanner.next().charAt(0);
		int [] ordenUsuario = Ejercicio1.ordenaNumeros(nro1, nro2, nro3, ordenUs);
		System.out.println(Arrays.toString(ordenUsuario));
		//c.
		int n1 = 0, n2 = 0, n3 = 0;
		char orden = ' ';
		if (n1 == 0||n2 == 0||n3 == 0||orden == ' '|| (orden!='a' && orden !='d') ) {
			if (n1==0) {
				n1=Ejercicio1.ingresoNumero();
			}
			if (n2==0) {
				n2=Ejercicio1.ingresoNumero();
			}
			if (n3==0) {
				n3=Ejercicio1.ingresoNumero();
			}
			if (orden == ' '|| (orden!='a' && orden !='d')) {
				orden=(char) Ejercicio1.ingresoChar();
			}
		}
		int [] ordenAsc = Ejercicio1.ordenaNumeros(15,n2,20,orden);
		System.out.println(Arrays.toString(ordenAsc));
		
		miScanner.close();
	}

}
