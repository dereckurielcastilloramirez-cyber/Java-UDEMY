import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesDeSistema
{
    public static void main(String[] args)
    {
        try {
            FileInputStream archivo = new FileInputStream("A:\\CURSOS\\Java\\SystemProperties\\src\\config.properties");
            System.out.println("Se agrego correctamente el archivo de configuracion");

            Properties p = new Properties(System.getProperties()); //carga las configuraciones del sistema en el objeto p
            p.load(archivo); //Agregar las configuraciones del objeto del config a las actuales en el sistema cargadas al objeto p

            p.setProperty("mi.propiedad.personalizada","Mi valor"); //otra forma de agregar a la configuracion
            System.setProperties(p); //actualizar las properties del objeto p a las generales

            Properties ps = System.getProperties();
            System.out.println("config.autor.nombre = " + ps.getProperty("config.autor.nombre")); //Extraer una sola propiedad del objeto
            System.out.println(System.getProperty("config.puerto.servidor")); //Extraer directamente del sistema ya actualizados

            //ps.list(System.out);
        }catch (Exception e){
            System.out.println("error = " + e);
        }
    }
}
