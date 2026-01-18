import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Litros del tanque");
        double litros = scanner.nextDouble();
        
        String estadoTanque = "";
        
        if(litros == 70){ estadoTanque = "Tanque lleno";}
        if(litros >= 60 && litros < 70){ estadoTanque = "Tanque casi lleno";}
        if(litros >= 40 && litros < 60){ estadoTanque = "Tanque a 3/4";}
        if(litros >= 35 && litros < 40){ estadoTanque = "Medio Tanque";}
        if(litros >= 20 && litros < 35){ estadoTanque = "Suficiente";}
        if(litros >= 1 && litros < 20){ estadoTanque = "Insuficiente";}
        else{
            System.out.println("Error en los litros, ingrese un numero entre 70 y 1");
        }

        System.out.println("estadoTanque = " + estadoTanque);
    }
}
