import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        //--------------------Recibir nombre de factura o descripcion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura: ");
        String nombreFactura = scanner.nextLine();
        //--------------------Recibir 1 precio de producto double
        System.out.println("Ingrese el precio del producto 1: ");
        double precio1 = scanner.nextDouble();

        //--------------------Recibir 2 precio de producto double
        System.out.println("Ingrese el precio del producto 2: ");
        double precio2 = scanner.nextDouble();

        //--------------------Sumar ambos precios
        double TOTAL = precio1 + precio2;

        //--------------------Agregar el impuesto de 19%
        double IVA = TOTAL * 0.19;

        //Mostrar en un string PRECIO BRUTO, IMPUESTO, PRECIO + IMPUESTO
        System.out.println("La factura de "+nombreFactura + "\nTotal bruto de "+ TOTAL + "\nImpuesto de " + IVA + "\n El monto total es "+ (TOTAL + IVA));
    }
}
