import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args){
        int numeroMenor=100000;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese la cantidad de numeros a ingresar: ");
        int cantidadNumeros = scanner.nextInt();

        int[] ListaNumeros = new int[cantidadNumeros];
        for( int n = 0; n < cantidadNumeros; n++){
            System.out.println("Ingrese el [" + n + "] :");
            ListaNumeros[n] = scanner.nextInt();
        }

        for(int numero : ListaNumeros){

            if(numero < numeroMenor){
                numeroMenor = numero;
            }else {
                continue;
            }
        }
        if(numeroMenor < 10){
            System.out.println("El numero menor es menor que 10");
        }else if(numeroMenor >= 10){
            System.out.println("el numero menor es igual o mayor que 10!");
        }


    }
}
