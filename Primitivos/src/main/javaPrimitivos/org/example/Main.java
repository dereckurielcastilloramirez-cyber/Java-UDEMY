package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            byte numeroByte = 7; //0 a 127
            System.out.println("Numero BYTE = " + numeroByte);
            System.out.println("Tipo byte corresponde en bytes a "+ Byte.BYTES);
            System.out.println("Tipo byte corresponde en bites a "+ Byte.SIZE);
            System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
            System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

            short enteroShort = 32767;
            System.out.println("Numero SHORT = " + enteroShort);
            System.out.println("Tipo Short corresponde en bytes a "+ Short.BYTES);
            System.out.println("Tipo Short corresponde en bites a "+ Short.SIZE);
            System.out.println("Valor maximo de un Short: " + Short.MAX_VALUE);
            System.out.println("Valor minimo de un Short: " + Short.MIN_VALUE);

            int enteroInt = 32768; //entero de 32 bits
            System.out.println("Numero Integer = " + enteroInt);
            System.out.println("Tipo Integer corresponde en bytes a "+ Integer.BYTES);
            System.out.println("Tipo Integer corresponde en bites a "+ Integer.SIZE);
            System.out.println("Valor maximo de un Integer: " + Integer.MAX_VALUE);
            System.out.println("Valor minimo de un Integer: " + Integer.MIN_VALUE);

            long enterolong = 9223372036854775807L; //especificar la L mayuscula al final para el largo del numero
            System.out.println("Numero Integer = " + enterolong);
            System.out.println("Tipo Long corresponde en bytes a "+ Long.BYTES);
            System.out.println("Tipo Long corresponde en bites a "+ Long.SIZE);
            System.out.println("Valor maximo de un Long: " + Long.MAX_VALUE);
            System.out.println("Valor minimo de un Long: " + Long.MIN_VALUE);

            //----------------------------------------------------------------------------------------------------------
            var numeroVar = 9223372036854775809D;


    }
}
