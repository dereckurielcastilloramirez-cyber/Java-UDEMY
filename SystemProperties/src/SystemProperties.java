import java.util.Properties;

public class SystemProperties {
    public static void main (String[] args){
        String username = System.getProperty("user.name"); //En documentacion de java, system properties https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html estan las llaves
        System.out.println("username = " + username); //usuario

        String home = System.getProperty("user.home");
        System.out.println("home = " + home); //ruta de usuario o home

        String workspace = System.getProperty("suer.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");

        System.out.println("lineSeparator = " + lineSeparator + "Una linea nueva");

        Properties P = System.getProperties();
        P.list(System.out);
    }
}
