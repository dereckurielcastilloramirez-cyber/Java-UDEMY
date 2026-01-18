public class InmutabilidadStrings {
    public static void main(String[] args) {
        String curso = "  Programacion Java ";
        String profesor = " Dereck Castilo ";

        String detalle = curso + " con el instructor" + profesor;
        System.out.println(detalle);

        int a = 10;
        int b = 5;

        System.out.println(detalle + " " + (a + b));
        System.out.println(a + b + detalle);
        //---------------CONCATENAR CARACTERES
        String concat_string = curso.concat(profesor);

        String string1 = "String1";
        String string2 = "String2";

        //---------------TRANSFORMAR CARACTERES
        String transform_string = string1.transform(c -> {
            return c + " con "  + string2;
        }); // concatena y devuelve la concatenacion en una nueva variable
        System.out.println("transform_string = " + transform_string);

        //---------------REEMPLAZAR un CHAR CON OTRA
        String replace_string  = string1.replace('s', 'S');

        System.out.println("replace_string = " + replace_string);



    }
}
