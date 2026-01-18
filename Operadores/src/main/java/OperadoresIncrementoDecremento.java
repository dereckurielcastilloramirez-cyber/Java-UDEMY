public class OperadoresIncrementoDecremento {
    public static void main(String[] args) {
        //Pre incremento
        System.out.println("PRE - INCREMENTO");
        int i = 1, j = ++i; // incrementa y luego asigna
        System.out.println("i = " + i +" j = " + j);

        //Post incremento
        System.out.println("POST - INCREMENTO");
        i = 2;
        j = i++;// asigna y luego incrementa
        System.out.println("i = " + i +" j = " + j);

        // Pre decremento
        System.out.println("PRE - DECREMENTO");
        i = 3;
        j = --i; //decrementa y luego asigna
        System.out.println("i = " + i +" j = " + j);

        System.out.println("POST - DECREMENTO");
        i = 3;
        j = i--; // asigna y luego decrementa
        System.out.println("i = " + i +" j = " + j);

    }
}
