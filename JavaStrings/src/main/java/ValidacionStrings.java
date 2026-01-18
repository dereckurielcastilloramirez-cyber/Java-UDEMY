import java.util.Arrays;
import java.util.Locale;

public class ValidacionStrings {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = (curso == null);

        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = ("");
        }
        System.out.println(curso.toUpperCase());
        //System.out.println("Curso de "+ curso); //no se puede concatenar con strings sin referencia o nulos

        boolean esVacio = curso.length() == 0;
        if (!esVacio){ //if (esVacio == false) es lo mismo con !
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        boolean esBlanco = curso.isBlank();
        if (!esVacio2){ //if (esVacio == false) es lo mismo con !
            System.out.println(curso.toUpperCase());
            //System.out.println("Bienvenido al curso ".concat(curso));
        }
        System.out.println("esVacio2 = " + esVacio2);
        System.out.println("esBlanco = " + esBlanco);
    }
}
