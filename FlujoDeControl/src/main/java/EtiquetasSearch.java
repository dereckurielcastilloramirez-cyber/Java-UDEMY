public class EtiquetasSearch {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal trigo";
        String palabra = "trigo";
        int max = frase.length();
        int maxPalabra = palabra.length();

        int cantidad = 0;

        buscar:for(int i = 0; i < max; i++) { //recorre cada caracter de la frase
            int k = i;
            for(int j = 0; j < maxPalabra; j++) { //recorre cada caracter de la palabra a buscar
           //recorre cada caracter de la frase k
                System.out.println(" i = " + i + " j = " + j + " k = " + k);
                if (frase.charAt(k++) != palabra.charAt(j)) { // si es diferente del caracter de la palabra continua a la siguiente letra en la frase
                    continue buscar;
                }

            }
            cantidad++;
        }
        System.out.println(palabra + " esta repetida " + cantidad + " veces");
    }
}