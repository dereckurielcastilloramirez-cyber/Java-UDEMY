public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;
        
        double promedio = (i + j + k) / 3d ;
        System.out.println("promedio = " + promedio);

        double p1 = i + j + k / 3d * 10;
        System.out.println("p = " + p1);

        double p2 = i + j + k / (3d * 10);
        System.out.println("p2 = " + p2);

        //     Preincre | Postdecrem
        double p3 = ++i + j-- + k / 3d * 10;
        System.out.println("p3 = " + p3);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

}
