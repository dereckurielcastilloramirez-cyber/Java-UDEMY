import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir los números
        System.out.print("Ingrese el primer número entero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int b = sc.nextInt();

        // Determinar el signo del resultado
        boolean esNegativo = (a < 0 && b > 0) || (a > 0 && b < 0);

        // Tomar valores absolutos para el bucle
        int valorA = Math.abs(a);
        int valorB = Math.abs(b);

        // Multiplicar como suma repetida
        int resultado = 0;
        for (int i = 0; i < valorB; i++) {
            resultado += valorA;
        }

        // Ajustar signo final
        if (esNegativo) {
            resultado = -resultado;
        }

        System.out.println("El resultado de la multiplicación es: " + resultado);

        sc.close();
    }
}
