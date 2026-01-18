public class ConcatenacionStrings {
    public static void main(String[] args) {
        String curso = "  Programacion Java ";
        String profesor = " Dereck Castilo ";

        String detalle = curso + " con el instructor" + profesor;
        System.out.println(detalle);

        int a = 10;
        int b = 5;

        System.out.println(detalle + " " + (a + b));
        System.out.println(a + b + detalle);

        String detalle2 = curso.concat(profesor);

    }
}
