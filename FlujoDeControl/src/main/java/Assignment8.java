import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        double sumaMayores5 = 0;
        int contadorMayores5 = 0;

        double sumaMenores4 = 0;
        int contadorMenores4 = 0;

        int contadorNotas1 = 0;

        double sumaTotal = 0;
        int contadorTotal = 0;

        for (int n = 0; n < 20; n++) {
            System.out.print("Ingrese la nota [" + (n + 1) + "] (1 a 7, 0 para salir): ");
            double nota = scann.nextDouble();

            if (nota == 0) {
                System.out.println("Error: Se ingresó 0. Finalizando el programa.");
                break; // salir del programa
            }

            if (nota < 1 || nota > 7) {
                System.out.println("Error: Nota fuera de rango (1 a 7). Finalizando el programa.");
                break; // salir del programa
            }

            // Acumular totales
            sumaTotal += nota;
            contadorTotal++;

            // Clasificar según la nota
            if (nota > 5) {
                sumaMayores5 += nota;
                contadorMayores5++;
            } else if (nota < 4) {
                sumaMenores4 += nota;
                contadorMenores4++;
            }

            if (nota == 1) {
                contadorNotas1++;
            }
        }

        // Calcular promedios
        double promedioMayores5 = (contadorMayores5 > 0) ? (sumaMayores5 / contadorMayores5) : 0;
        double promedioMenores4 = (contadorMenores4 > 0) ? (sumaMenores4 / contadorMenores4) : 0;
        double promedioTotal = (contadorTotal > 0) ? (sumaTotal / contadorTotal) : 0;

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio de notas mayores a 5: " + promedioMayores5);
        System.out.println("Promedio de notas menores a 4: " + promedioMenores4);
        System.out.println("Cantidad de notas con valor 1: " + contadorNotas1);
        System.out.println("Promedio total: " + promedioTotal);

        scann.close();
    }
}
