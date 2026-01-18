import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputsTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        //String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();
            //numeroDecimal = Integer.parseInt(numeroStr);//casting a entero
        }catch (Exception e){
            System.out.println("Error, debe ingresar un numero entero!");

            main(args);
            //return;
            System.exit(0);
        }

        System.out.println("numero DECIMAL = " + numeroDecimal);

        String resultadoBinario = "numero BINARIO de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero OCTAL de " + numeroDecimal + " es "+ Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero HEXADECIMAL de " + numeroDecimal + " es "+ Integer.toHexString(numeroDecimal);

        String mensaje  = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        //Mostrar en consola
        System.out.println(mensaje);
    }

}
