import javax.swing.*;

public class ForWithArray {
    public static void main(String[] args) {
        String[] nombres = new String[6];
        nombres[0] = "Dereck";
        nombres[1] = "Danna";
        nombres[2] = "Rosalia";

        String[] edades = {"23", "28", "60"};
        int count = edades.length;

        for( int i = 0; i < count; i++){
            System.out.println(nombres[i] + " tiene " + edades[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese nombre : ");

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, "Se encontró "+ buscar);
        }
        else {
            JOptionPane.showMessageDialog(null, "No se encontro a " + buscar );
        }
    }
}
