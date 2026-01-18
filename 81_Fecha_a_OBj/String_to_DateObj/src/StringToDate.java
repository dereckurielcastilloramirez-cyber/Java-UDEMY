import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringToDate {
    public static void main(String[] args) throws ParseException {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato \"yyyy-MM-dd\" : ");

        try {
            Date fecha = format.parse(s.next());
            //Date fecha = format.parse("2020-01-29");
            System.out.println("fecha : "+ fecha);
            System.out.println("fecha : "+ format.format(fecha));

            Date fecha2 = new Date();//fecha actual

            if(fecha.after(fecha2)){
                System.out.println("Fecha1 de usuario es despues de fecha2");
            }else if(fecha.before(fecha2)){
                System.out.println("Fecha1 de usuario es antes de fecha2");
            }else if(fecha.equals(fecha2)){
                System.out.println("Fecha1 de usuario es igual a fecha2");
            }


            if(fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha1 de usuario es despues de fecha2");
            }else if(fecha.compareTo(fecha2) < 0){
                System.out.println("Fecha1 de usuario es antes de fecha2");
            }else if(fecha.compareTo(fecha2) == 0){
                System.out.println("Fecha1 de usuario es igual a fecha2");
            }

        }catch (ParseException e){
            e.printStackTrace();
        }

        //COMPARAR FECHAS

    }
}
