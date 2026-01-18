public class StringConcatTypes {

        public static void main(String[] args) {
            String a = "a";
            String b = "b";
            String c = a;
            int veces = 100000 ;
            //------------------------CONCAT-----------------------------

            long t1 = System.currentTimeMillis();
             for(int i = 0; i < veces; i++){
                  c = c.concat(a).concat(b).concat("\n"); //500 -> 1ms -2ms
             }
            long f1 = System.currentTimeMillis();
            System.out.println("concat = " + (f1-t1));
            //--------------------------OPERADOR-------------------------

            long t2 = System.currentTimeMillis();
            for(int i = 0; i < veces; i++){
                c += a + b + "\n"; //500 -> 1ms -2ms
            }
            long f2 = System.currentTimeMillis();
            System.out.println("operador (+) = " + (f2-t2));
            //-------------------------STRING BUILDER--------------------------------

            StringBuilder sb = new StringBuilder(a); //stringbuilder es mutable
            long t3 = System.currentTimeMillis();
            for(int i = 0; i < veces; i++){
                sb.append(a).append(b).append("\n");
            }

            long f3 = System.currentTimeMillis();
            System.out.println("String Builder  = "+(f3-t3));


        }
}
