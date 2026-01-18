public class FORconFlujoControl {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("---------- 2 Variables -----------");
        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }

        System.out.println("---------- Numeros Pares ----------");
        for(int i = 0; i < 20; i++){
            if( !(i%2 == 0)){
                continue;
            }
            System.out.println("i = " + i);
        }
        
    }
}
