import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa nombre 1: ");
        String nombre1 = scanner.nextLine();

        System.out.println("Ingresa nombre 2: ");
        String nombre2 = scanner.nextLine();

        System.out.println("Ingresa nombre 3: ");
        String nombre3 = scanner.nextLine();

        String nuevoNombre1 = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length() - 2);
        String nuevoNombre2 = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length() - 2);
        String nuevoNombre3 = Character.toUpperCase(nombre3.charAt(1)) + "." + nombre3.substring(nombre3.length() - 2);

        String resultado = nuevoNombre1 + "_" + nuevoNombre2 + "_" + nuevoNombre3;

        System.out.println("Resultado: " + resultado);




    }
}
