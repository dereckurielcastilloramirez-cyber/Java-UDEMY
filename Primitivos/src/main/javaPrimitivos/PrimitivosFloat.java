public class PrimitivosFloat {
    //static long varLong = 45.45f;//flotante
    public static void main(String[] args) {
        float realFloat = 2120.0f; // = 2.12e3f es lo mismo pero en notacion
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("Float corresponde en bites a = " + Float.SIZE);
        System.out.println("Maximo valor de float = " + Float.MAX_VALUE);
        System.out.println("Minimo valor de float = " + Float.MIN_VALUE);

        System.out.println("----------------------------------------------");

        double realDouble = 4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en byte a = " + Double.BYTES);
        System.out.println("Double corresponde en bites a = " + Double.SIZE);
        System.out.println("Maximo valor de Double = " + Double.MAX_VALUE);
        System.out.println("Minimo valor de Double = " + Double.MIN_VALUE);

        System.out.println("----------------------------------------------");
        var varInteger = 3;//entero
        var varFlotante = 3.141516f;//flotante
        var varDouble = 3.141516;//double
        var varString = "VarasString";//double
        System.out.println("varFlotante = " + varFlotante);



    }
}
