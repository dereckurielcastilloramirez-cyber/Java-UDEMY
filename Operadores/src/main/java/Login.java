import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String[] usernames = new String[2]; // [# ELEMENTOS]
        String[] passwords = {"1234", "1234"}; // [# ELEMENTOS]

        usernames[0] = "Dereck";
        usernames[1] = "admin";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String usuario = scanner.next();

        System.out.println("Ingrese el password");
        String contra = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i ++) {
            if (usernames[i].equalsIgnoreCase(usuario) && passwords[i].equalsIgnoreCase(contra)) {
                esAutenticado = true;
                System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
                break;
            } else {
                System.out.println("Usuario o contraseña incorrectos");
                System.out.println("Lo siento, requiere autenticacion");
                break;
            }
        }
    }
}
