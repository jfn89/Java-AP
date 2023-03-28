package principal;
import java.util.Arrays;
public class Ejercicio1 {
	public static int  contadorLetra(String palabra, char letra) {
		int cantidad = 0;
		for(int indice =0;indice<palabra.length();indice++) {
			char caracter = palabra.charAt(indice);
			if (caracter == letra) {
				cantidad+=1;
			}
		}
	return cantidad;
	}
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
	public static int [] orden(int nro1,int nro2,int nro3,char orden) {
		int numeros [] = {nro1,nro2,nro3};
		if (orden == 'a') {
			if (nro1>nro2) {
				if(nro1>nro3) {
					if (nro2>nro3) {
						numeros [0]= nro3;
						numeros [1]= nro2;
						numeros [2]= nro1;
					}else {
						numeros [0]= nro2;
						numeros [1]= nro3;
						numeros [2]= nro1;
					}
				}else {
						numeros [0]= nro2;
						numeros [1]= nro1;
						numeros [2]= nro3;
					}
			}else {
				if (nro2>nro3) {
					if (nro1>nro3) {
						numeros [0]= nro3;
						numeros [1]= nro1;
						numeros [2]= nro2;
					}else {
						numeros [0]= nro1;
						numeros [1]= nro3;
						numeros [2]= nro2;
					}
				}else {
					numeros [0]= nro1;
					numeros [1]= nro2;
					numeros [2]= nro3;
				}
			}
		}else {
			if (nro1>nro2) {
				if(nro1>nro3) {
					if (nro2>nro3) {
						numeros [0]= nro1;
						numeros [1]= nro2;
						numeros [2]= nro3;
					}else {
						numeros [0]= nro1;
						numeros [1]= nro3;
						numeros [2]= nro2;
					}
				}else {
						numeros [0]= nro3;
						numeros [1]= nro1;
						numeros [2]= nro2;
					}
			}else {
				if (nro2>nro3) {
					if (nro1>nro3) {
						numeros [0]= nro2;
						numeros [1]= nro1;
						numeros [2]= nro3;
					}else {
						numeros [0]= nro2;
						numeros [1]= nro3;
						numeros [2]= nro1;
					}
				}else {
					numeros [0]= nro3;
					numeros [1]= nro2;
					numeros [2]= nro1;
				}
			}
			}
		return numeros;
		}
	public static int sumarMayores(int[] numeros, int nro) {
		int acumulador;
        acumulador = 0;
        for (int i : numeros) {
            if (i > nro) {
            	acumulador += i;
            }
            i++;
        }
        return acumulador;
	}
	}
