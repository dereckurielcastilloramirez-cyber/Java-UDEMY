import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String estado = "";

        double matematicas = 0.0;
        double historia = 0.0;
        double ciencias = 0.0;

        double promedio = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nota de matematicas: ");
        matematicas = scanner.nextDouble();

        System.out.println("Nota de historia: ");
        historia = scanner.nextDouble();

        System.out.println("Nota de ciencias: ");
        ciencias = scanner.nextDouble();
        
        promedio = (matematicas + ciencias + historia)/3;
        
        estado = promedio >= 6 ? "APROBADO": "REPROBADO";
        System.out.println("estado = " + estado);
        

    }
}
