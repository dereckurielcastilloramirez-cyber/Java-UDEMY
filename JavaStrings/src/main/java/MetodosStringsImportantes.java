public class MetodosStringsImportantes {
    public static void main(String[] args) {
        String nombre = "Dereck";
        System.out.println("nombre tiene " + nombre.length() + " caracteres");
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toUpperCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Dereck\") = " + nombre.equals("Dereck"));
        System.out.println("nombre.equals(\"dereck\") = " + nombre.equals("dereck"));
        System.out.println("nombre.equalsIgnoreCase(\"dereck\") = " + nombre.equalsIgnoreCase("dereck"));
        System.out.println("nombre.compareTo (\"Dereck\") = " + nombre.compareTo("Dereck"));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.substring(1, 4 ) = " + nombre.substring(1, 4 ));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);

        System.out.println("trabalenguas.indexOf('e') = " + trabalenguas.indexOf('e'));
        System.out.println("trabalenguas.lastIndexOf('e') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.contains(\"le\") = " + trabalenguas.contains("le"));
        System.out.println("trabalenguas.startsWith(\"t\") = " + trabalenguas.startsWith("t"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println("  Trabalenguas ".trim());

    }
}
