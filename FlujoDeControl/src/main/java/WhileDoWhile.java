public class WhileDoWhile {
    public static void main(String[] args) {
        int i = 0;
        while(i<30){
            System.out.println("Iteracion " + i);
            i++;
        }

        i=0;
        boolean Prueba = true;
        while(Prueba){
            if(i == 7) Prueba = false;
            System.out.println("P = " + i);
            i++;
        }

        i=0;
        Prueba = true;
        do{
            if(i == 10) Prueba = false;
            System.out.println("DW = " + i);
            i++;
        }while(Prueba);

    }
}
