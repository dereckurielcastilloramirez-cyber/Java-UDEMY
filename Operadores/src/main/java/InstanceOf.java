import java.util.Scanner;

public class InstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String";
        Integer num = 7;

         boolean b1 = texto instanceof String;
        System.out.println("Es texto del tipo string = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Es texto del tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Es num del tipo Integer = " + b1);

        b1 = num instanceof Object;
        System.out.println("Es num del tipo Object = " + b1);

        b1 = num instanceof Number;
        System.out.println("Es num del tipo Number = " + b1);

        Double decimal = 45.23;
        b1 = decimal instanceof Number;
        System.out.println("Es decimal del tipo Number = " + b1);

    }
}
