import java.util.Scanner;

public class InstanceOfAbstractos {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese algo: ");
        Object objeto = scanner.next();

        //Object texto = "Creando un objeto de la clase String";
        //Integer num = 7;

        boolean b1 = objeto instanceof Object;
        System.out.println("Es objeto del tipo Object = " + b1);


        b1 = objeto instanceof Number;
        System.out.println("Es objeto del tipo Number = " + b1);

        b1 = objeto instanceof String;
        System.out.println("Es objeto del tipo string = " + b1);

        b1 = objeto instanceof Integer;
        System.out.println("Es objeto del tipo Integer = " + b1);

        b1 = objeto instanceof Double;
        System.out.println("Es objeto del tipo Double = " + b1);

        b1 = objeto instanceof Long;
        System.out.println("Es objeto del tipo Long = " + b1);
    }
}
