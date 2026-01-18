public class ConversionPrimitivotoCadena {
    public static void main(String[] args) {
        
        int numero = 100;
        System.out.println("numero = " + numero);
        String numeroStr = Integer.toString(numero);
        System.out.println("numeroStr = " + numeroStr);
        
        numeroStr = String.valueOf(numero+10);
        System.out.println("numeroStr2 = " + numeroStr);

        double realDouble = 123456;
        String realStr = Double.toString(realDouble);
        System.out.println("realStr 1 = " + realStr);
        realStr = String.valueOf(realDouble);
        System.out.println("realStr 2 = " + realStr);
    }
}
