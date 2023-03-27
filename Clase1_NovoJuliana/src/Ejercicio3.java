public class Ejercicio3 {
    public static void main(String[] args) {
        String eLocal = "Local", eVisitante = "Visitante";
        int gLocal = 0, gVisitante = 0, difGol = 0;
        /*con if*/
        if (gLocal == gVisitante) {
            System.out.println("Empate entre " + eLocal + " y " + eVisitante);
        } else {
            if (gVisitante > gLocal) {
                if (gVisitante - gLocal == 1) {
                    System.out.println(eVisitante + ", ganó por la mínima diferencia.");
                }
                if (gVisitante - gLocal == 2) {
                    System.out.println(eVisitante + ", fue una justa victoria.");
                }
                if (gVisitante - gLocal >= 3) {
                    System.out.println(eVisitante + ", goleada.");
                }

            } else {
                if (gLocal - gVisitante == 1) {
                    System.out.println(eLocal + ", ganó por la mínima diferencia.");
                }
                if (gLocal - gVisitante == 2) {
                    System.out.println(eLocal + ", fue una justa victoria.");
                }
                if (gLocal - gVisitante >= 3) {
                    System.out.println(eLocal + ", goleada.");
                }
            }
        }

        /*con swich*/
        if (gLocal > gVisitante) {
            difGol = gLocal - gVisitante;
            switch (difGol) {
                case 0:
                    System.out.println("Empate entre " + eLocal + " y " + eVisitante);
                    break;
                case 1:
                    System.out.println(eLocal + ", ganó por la mínima diferencia.");
                    break;
                case 2:
                    System.out.println(eLocal + ", fue una justa victoria.");
                    break;
                default:
                    System.out.println(eLocal + ", goleada.");
            }
        } else {
            difGol = gVisitante - gLocal;
            switch (difGol) {
                case 0:
                    System.out.println("Empate entre " + eLocal + " y " + eVisitante);
                    break;
                case 1:
                    System.out.println(eVisitante + ", ganó por la mínima diferencia.");
                    break;
                case 2:
                    System.out.println(eVisitante + ", fue una justa victoria.");
                    break;
                default:
                    System.out.println(eVisitante + ", goleada.");
            }
        }
    }
}
