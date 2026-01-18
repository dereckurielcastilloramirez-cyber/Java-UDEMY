public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 30;
        System.out.println("numero DECIMAL = " + numeroDecimal);

        System.out.println("numero BINARIO de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));


        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numero OCTAL de " + numeroBinario + " es "+ Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("numero HEXADECIMAL de " + numeroBinario + " es "+ Integer.toHexString(numeroDecimal));

        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);


    }

}
