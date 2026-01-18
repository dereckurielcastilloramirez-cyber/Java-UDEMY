public class EtiquetasEnBucles {
    public static void main(String[] args){

        bucle1: for(int i = 1; i<=7; i++) { // 7 dias de la semana

            buclex:for(int j = 1; j<=8; j++){ // 8 horas
                if (i==6 || i == 7){
                    System.out.println("Dia = " + i + " descansas y trabajas " + j + " horas ");
                    continue bucle1;
                }
                System.out.println("Dia = "+ i + " Trabajas "+ j + "horas");
            }
        }
        System.out.println();
        bucle2: for(int i = 0; i<5; i++){
            System.out.println();
            for(int j = 0; j<5; j++){
                if (i==2){
                    break bucle2;
                }
                System.out.print("[i = " + i + " j = " + j + "]");
            }
        }

        System.out.println("----------------------------------------------------");

        bucle3: for(int i = 0; i<5; i++){
            System.out.println();
            for(int j = 0; j<5; j++){
                if (i==2){
                    continue bucle3;
                }
                System.out.print("[i = " + i + " j = " + j + "]");
            }
        }



    }
}
