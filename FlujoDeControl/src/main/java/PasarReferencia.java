public class PasarReferencia {
    public static void main(String[] args) {
        int[] edad = {10,11,12};

        System.out.println("iniciamos el main con i = " + edad);
        for(int i = 0; i < edad.length; i++)
        {
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("before test method");
        test(edad);
        System.out.println("after test method");
        for(int i = 0; i < edad.length; i++)
        {
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println("Final of main method with data array modified");
    }
    //nuevo metodo que no devuelve nada
    public static void test(int[] edadArr){
        System.out.println("iniciamos metodo test ");
        for(int i = 0; i < edadArr.length; i++)
        {
            edadArr[i] = edadArr[i] + 20
            ;
        }
        System.out.println("Finaliza metodo test");
    }
}

