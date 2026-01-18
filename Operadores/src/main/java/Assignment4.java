import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese un segundo numero: ");
        double numero2 = scanner.nextDouble();

        double mayor = numero1 > numero2 ? numero1 : numero2;
        double menor = numero1 < numero2 ? numero1 : numero2;

        //String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;
        //System.out.println("El orden es: " + resultado);

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

    }
}
