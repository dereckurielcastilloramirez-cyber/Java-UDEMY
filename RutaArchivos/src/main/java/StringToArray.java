public class StringToArray {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length; //length es un atributo aqui NO UN METODO COMO EN LOS STRINGS

        System.out.println("largo = " + largo);
        for(int i = 0; i < largo; i++){
            //System.out.println(arreglo[i]);
        }
        System.out.println(trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for(int j = 0; j<l; j++){
            //System.out.println("arreglo2[j] = " + arreglo2[j]);
        }
        
        String cadena = "alguna.imagen.pdf";
        String[] array = cadena.split("\\.");
        int c = array.length;
        for (int f = 0; f<c; f++){
            System.out.println("array[f] = " + array[f]);
        }
        System.out.println("extension = " + array[c-1]);
    }
}
