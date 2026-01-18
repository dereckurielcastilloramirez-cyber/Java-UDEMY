import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese promedio: ");
        float promedio = scanner.nextFloat();

        if(promedio > 8){
            System.out.println("EXCELENTE"); //mas de una linea usar llaves, si solo es una se puede usar sin llaves
        } else if (promedio >  6.5 && promedio <= 8) {
            System.out.println("APROBADO");
        } else{
            System.out.println("REPROBADO");
        }

    }
}
