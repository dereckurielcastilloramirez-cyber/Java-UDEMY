import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int eleccion;

        do{
            System.out.println(" 1 - actualizar  \n 2 - eliminar \n 3 - crear  \n 4 - lista  \n 5 - salir");
            System.out.println("Ingrese la opcion:");
            eleccion = scan.nextInt();

            switch (eleccion){
                case 1:
                    System.out.println("Usuario actualizado correctamente");
                    break;
                case 2:
                    System.out.println("Usuario eliminado correctamente");
                    break;
                case 3:
                    System.out.println("Usuario creado correctamente");
                    break;
                case 4:
                    System.out.println("Lista creada correctamente");
                    break;
                case 5:
                    System.out.println("Haz salido con exito!");
                    break;

            }

        }while (eleccion != 5);



    }
}
