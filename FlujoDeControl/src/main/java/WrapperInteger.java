public class WrapperInteger {
    public static void main(String[] args){

        //toma un valor entero primitivo y convierte a un objeto
        Integer intObjeto = Integer.valueOf(32768);
        Integer intObjeto2 = 32768;

        //convertir primitivo a un objeto
        int intPrimitivo = 32768;
        Integer objeto = Integer.valueOf(intPrimitivo);

        //convertir de objeto a primitivo de manera automatica
        int num = intObjeto;
        int num2 = intObjeto2.intValue();

        String cadena = "32767";
        Integer value = Integer.valueOf(cadena);

    }
}
