public class OperadoresRelacionales {
    public static void main(String[] args) {
        int  i = 3;
        byte j = 7;
        float k = 126e-7f;
        double l = 2.14334e3;
        boolean m = false;

        boolean b1 = i == j ;
        System.out.println(b1);

        boolean b2 = !b1;
        System.out.println(b2); // otra forma <>
        
        boolean b3 = i != j;
        System.out.println("b3 = " + b3);
        
        boolean b4 = m == true;
        System.out.println("b4 = " + b4);

        boolean b5 = i > j;
        System.out.println("b5 = " + b5);

        boolean b6 = l >= k;
        System.out.println("b6 = " + b6);

    }
}
