public class PrimitivosChar {
    public static void main(String[] args) {
        //var caracter = '9'; //se aplica lo mismo, lo asigna automaticamente a char
        char caracter = '\u0040'; //es el arroba en el windows mapa de caracteres
        char decimal = 64; // caracter con codigo decimal, es el arroba en decimal
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        //OPERADOR LOGICO ==, OPERACION BOOLEANA, primero resuelve y luego concatena
        System.out.println("Decimal = Caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("Simbolo = caracter: " + (simbolo == caracter));

        System.out.println("Char en byte = " + Character.BYTES);
        System.out.println("Char en bites = " + Character.SIZE);
        System.out.println("Char valor maximo = " + Character.MAX_VALUE);
        System.out.println("Char valor minimo = " + Character.MIN_VALUE);

        //char espacio = '\u0020';
        char espacio = ' ';
        System.out.println("espacio representado =" + espacio + Character.BYTES);

        char retroceso = '\b'; //retira el ultimo caracter
        System.out.println("retroceso representado =" + retroceso + Character.BYTES);
        System.out.println("retroceso doble representado =" + retroceso + retroceso + Character.BYTES);

        char tabulador = '\t';
        System.out.println("tabulador representado\t=" + tabulador + Character.BYTES);

        char nuevaLinea = '\n';
        char nuevaLineaAnt = '\r';
        System.out.println("nuevaLinea representado\t=" + nuevaLinea + Character.BYTES);
        System.out.println("nuevaLineaAnt + Character.BYTES = " + nuevaLineaAnt + Character.BYTES);
        System.out.println("metodo line.separator + Character.BYTES = " + System.getProperty("line.separator") + Character.BYTES);

    }
}
