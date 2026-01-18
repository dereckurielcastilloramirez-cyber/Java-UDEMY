public class PasarValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("iniciamos el main con i = " + i);
        test(i);
        System.out.println("valor de i? = " + i);
    }
    //nuevo metodo que no devuelve nada
    public static void test(int i){
        System.out.println("iniciamos metodo test con i = " + i);
        i =35;
        System.out.println("nuevo valor de i = " + i);
    }
}
