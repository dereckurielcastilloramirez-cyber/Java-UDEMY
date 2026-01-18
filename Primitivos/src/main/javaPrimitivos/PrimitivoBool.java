public class PrimitivoBool {
    public static void main(String[] args) {

        boolean datoLogico = true;
        boolean datoLogico1 = Boolean.FALSE;
        boolean datoLogico2 = Boolean.FALSE.booleanValue();
        System.out.println("datoLogico = " + datoLogico);
        //System.out.println("datoLogico1 = " + datoLogico1);
        //System.out.println("datoLogico2 = " + datoLogico2);

        double d = 98654.54e-3;//98.65454
        System.out.println("d = " + d);
        float f = 1.2345e2f; //123.4500
        System.out.println("f = " + f);
        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = 3-2 ==1;
        System.out.println("esIgual = " + esIgual);


    }

}
