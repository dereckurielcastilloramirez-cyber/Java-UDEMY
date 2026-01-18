import javax.swing.*;

public class InputsVentanas {
    public static void main(String[] args) {
        //Ingresar datos como string mediante una ventana
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);//casting a entero
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero entero");
            main(args);
            //return;
            System.exit(0);
        }


        System.out.println("numero DECIMAL = " + numeroDecimal);

        String resultadoBinario = "numero BINARIO de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        String resultadoOctal = "numero OCTAL de " + numeroDecimal + " es "+ Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        String resultadoHex = "numero HEXADECIMAL de " + numeroDecimal + " es "+ Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        String mensaje  = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        //Mostrar cuadro de dialogo con la impresion
        JOptionPane.showMessageDialog(null, mensaje);
    }

}