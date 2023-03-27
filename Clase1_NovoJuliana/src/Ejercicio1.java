public class Ejercicio1 {
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;
        int numero = numeroInicio;
        char pares = 's';
        /*parte a*/
        while (numero < numeroFin + 1){
            System.out.println(numero);
            numero += 1;
        }
        /*parte b*/
        while (numero < numeroFin + 1){
            if (numero % 2 == 0){
                System.out.println(numero);
            }
            numero += 1;
        }
        /*parte c*/
        switch (pares) {
            case 's':
                while (numero < numeroFin + 1){
                    if (numero % 2 == 0){
                        System.out.println(numero);
                        }
                    numero += 1;
                }
            case 'n':
                while (numero < numeroFin + 1){
                    if (numero % 2 != 0){
                        System.out.println(numero);
                        }
                        numero += 1;
                }
        }
        /*parte d*/
        for (int num = numeroFin; num>numeroInicio; num--){
            if (num % 2 == 0){
                System.out.println(num);
            }
        }
        }
    }