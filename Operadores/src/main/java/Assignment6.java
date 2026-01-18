import javax.swing.*;
public class Assignment6 {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog(null,"Ingrese nombre 1 : ");
        String nombre2 = JOptionPane.showInputDialog(null,"Ingrese nombre 2 : ");
        String nombre3 = JOptionPane.showInputDialog(null, "Ingrese nombre 3 : ");

        String[] name1 = nombre1.split(" ");
        String[] name2 = nombre2.split(" ");
        String[] name3 = nombre3.split(" ");

        int largo1 = name1[0].length();
        int largo2 = name2[0].length();
        int largo3 = name3[0].length();

        if (largo1 > largo2 && largo1 > largo3){
            System.out.println( nombre1 + " tiene el nombre más largo");
        }

        if (largo2 > largo1 && largo2 > largo3){
            System.out.println( nombre2 + " tiene el nombre más largo");
        }

        else{
            System.out.println( nombre3 + " tiene el nombre más largo");
        }


        
        


    }
}
