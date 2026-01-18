import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("suma" + i + j );

        int resta= i - j ;
        System.out.println("resta = " + resta);

        int multi = i*j;
        System.out.println("multi = " + multi);

        int div = i /j;
        float div1 = (float)i / j;
        System.out.println("div int = " + div);
        System.out.println("div float = " + div1);
        
        int modulo = i % j;
        System.out.println("modulo = " + modulo);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero : "));
        if (numero % 2 == 0){
            System.out.println("NUMERO PAR : " + numero);
        }
        else {
            System.out.println("NUMERO IMPAR");
        }

    }
}
