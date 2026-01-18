import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//siempre de java.util NO java.sql
public class UtilCalendar {
    public static void main(String[] args){
        Calendar calendario = Calendar.getInstance();

        Date fecha = calendario.getTime();

        System.out.println("fecha 0= " + fecha);


        calendario.set(2020, 11, 21, 20, 20, 20);

        fecha = calendario.getTime();

        System.out.println("fecha 1= " + fecha);

        calendario.set(2002, Calendar.AUGUST, 8, 20, 20, 20);

       fecha = calendario.getTime();

        System.out.println("fecha 2= " + fecha);

        System.out.println("calendario = " + calendario);

        //asignar de manera manual
        calendario.set(Calendar.YEAR, 1962);
        calendario.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 21);
        calendario.set(Calendar.HOUR_OF_DAY, 19);
        calendario.set(Calendar.MINUTE, 8);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 321);

        System.out.println("fecha simple= " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS"); //formato en 24 hrs
        String fechaFormato = formato.format(fecha);

        System.out.println("fecha con Formato = " + fechaFormato);

        //asignacion de hora con AM o PM
        calendario.set(Calendar.HOUR, 11);
        calendario.set(Calendar.AM_PM, Calendar.AM);
        fecha = calendario.getTime();

        formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a"); //formato en 12 horas
        fechaFormato = formato.format(fecha);

        System.out.println("fecha CONFIG= " + fecha);

        //FORMATO CONFIGURADO


    }
}
