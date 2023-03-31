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
		int [] ordenAsc = Ejercicio1.ordenaNumeros(15,0,20,' ');
		System.out.println(Arrays.toString(ordenAsc));
		
		//Ejercicio 2
		String TipoOp="multi";
		String RutaArc ="D:\\Users\\Juliana\\Documentos\\Argentina Programa\\Java-AP\\Clase4_NovoJuliana\\src\\archivos\\Numeros.txt";	
		Ejercicio2.sumaNumeros(RutaArc);
		Ejercicio2.operaNumeros(RutaArc, TipoOp);
		
		//Ejercicio 3
		String PathEntrada="D:\\Users\\Juliana\\Documentos\\Argentina Programa\\Java-AP\\Clase4_NovoJuliana\\src\\archivos\\Entrada.txt";
		String PathSalida="D:\\Users\\Juliana\\Documentos\\Argentina Programa\\Java-AP\\Clase4_NovoJuliana\\src\\archivos\\Salida.txt";
		String OpcCodificar;
	    String IngresoTxt;
	    int IngresoDesp;
	    System.out.println("*********** Clase 4 - Ejecicio 3  *************");
        System.out.println("Ingrese: 1 para Codificar | 2 para Decodificar");
        OpcCodificar=miScanner.nextLine();
        System.out.println("Ingrese Desplazamiento:");
		IngresoDesp=Integer.parseInt(miScanner.nextLine());
		 
        switch(OpcCodificar) {
		case "1": 
			 System.out.println("Ingrese texto a codificar:");
			 IngresoTxt=miScanner.nextLine();
			 Ejercicio3Salida EscriboArchivo= new ArcSalida(IngresoTxt,PathEntrada);
             EscriboArchivo.EscribirArchivos(); 
			 Ejercicio3 ClassCod=new codificar(IngresoTxt,IngresoDesp);
			 Ejercicio3 EscriboArchCod=new ArcSalida(ClassCod.Codificar(),PathCodificado);
			 EscriboArchCod.EscribirArchivos();
			 break;
		case "2":
			try {
				Ejercicio3Entrada LeoArchivo=new ArcEntrada(PathCodificado);
				Ejercicio3 ClassDeco=new decodificar(LeoArchivo.LeerArchivos(),IngresoDesp);
				Ejercicio3Salida EscriboArcDeco=new ArcSalida(ClassDeco.Decodificar(),PathSalida);
				EscriboArcDeco.EscribirArchivos();
				System.out.println("Exito - Se ejecutó correctamente");
				}
			catch(Exception e){
				System.out.println("Error - Hubo problemas y no se ejecutó correctamente: " + e);
			}
			
				break;
				
		default:  System.out.println("No existe esa opción");
	}
	miScanner.close();
	}
}
