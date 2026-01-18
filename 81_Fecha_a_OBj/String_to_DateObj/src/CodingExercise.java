import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CodingExercise {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato \"yyyy-MM-dd\" : ");

        try{
            Date fechaNacimiento = format.parse(scanner.next());
            Date fecha2 = new Date();    //fecha actual

            long diferenciaMillis = fecha2.getTime() - fechaNacimiento.getTime();

            // Convertir a años (aproximado: 1 año = 365.25 días)
            long edad = (long)(diferenciaMillis / (1000L * 60 * 60 * 24 * 365.25));

            System.out.println("La edad es: " + edad + " años");

        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}

