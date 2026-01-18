public class ConversionCadenastoPrimitivo {
    public static void main(String[] args) {

        String numeroStr = "50";
        int numerInt = Integer.parseInt(numeroStr);
        System.out.println("numerInt = " + numerInt);

        String realStr = "98765.43e-3";
        double realDoube = Double.parseDouble(realStr);
        System.out.println("realDoube = " + realDoube);
        
        String logicoStr = "true";
        boolean loicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("loicoBoolean = " + loicoBoolean);

        var logicoVar = "true";
        boolean logicoBool = Boolean.parseBoolean(logicoVar);
        System.out.println("Var - bool = " + logicoBool);

    }
}
