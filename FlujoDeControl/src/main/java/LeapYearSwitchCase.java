import java.util.Scanner;

public class LeapYearSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MES = ");
        int mes = scanner.nextInt();
        System.out.println("AÑO = ");
        int year = scanner.nextInt();
        int numeroDias = 0;

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (year % 400 == 0 || (year % 4 == 0) && !(year % 100 == 0)) {
                    numeroDias = 29; // BISIESTO
                } else {
                    numeroDias = 28; // NO BISIESTO
                }
                break;
            default:
                System.out.println("Dias indefinidos");

        }


    }
}
