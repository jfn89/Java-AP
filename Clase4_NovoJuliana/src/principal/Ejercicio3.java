package principal;
public class Ejercicio3 {
	public String codificar(String palabra, int desplaza) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String codigo = "";
		for(int i =0;i<palabra.length();i++) {
			char caracter = palabra.charAt(i);
			int indice = abecedario.indexOf(caracter);
			if(indice!=-1) {
				int indiceCodificado = (indice + desplaza) % abecedario.length();
		        char caracterCodificado = abecedario.charAt(indiceCodificado);
		        codigo += caracterCodificado;
		      } else {
		        codigo += caracter;
		      }
		    }
		    return codigo;
		  }
	public String decodificar(String codigo, int desplaza) {
		return codificar(codigo,-desplaza);
	}
}
