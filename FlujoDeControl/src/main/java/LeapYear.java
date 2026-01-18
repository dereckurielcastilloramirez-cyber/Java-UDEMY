import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("MES = ");
        int mes = scanner.nextInt();
        System.out.println("AÑO = ");
        int year = scanner.nextInt();

        int numeroDias = 0;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
           numeroDias = 30;
        }else if(mes == 2) {
            if (year % 400 == 0 || (year % 4 == 0) && !(year % 100 == 0)) {
                numeroDias = 29; // BISIESTO
            } else {
                numeroDias = 28; // NO BISIESTO
            }
        }
        System.out.println("Numero de dias : " + numeroDias);
    }
}
