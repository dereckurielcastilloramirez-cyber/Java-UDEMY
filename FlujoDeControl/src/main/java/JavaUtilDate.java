import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        String fechastr = df.format(fecha);

        System.out.println("fechastr = " + fechastr);
        
    }
}
