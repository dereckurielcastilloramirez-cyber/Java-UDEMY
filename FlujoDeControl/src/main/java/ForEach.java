public class ForEach {
    public static void main(String[] args){

        int[] array = {1,3,5,7,9,11,13,15};
        //por cada numero en el arreglo
        for(int num: array){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Monserrat Morales Cordova", "Samantha Elany Esparza Alvarado", "Fernanda Areli Zuleta Lopez", "Juan Carlos Cardoza Jimenez"};
        //por cada nombre en la lista de nombres, iniciar la variable en base al tipo de datos contenidos en las listas
        for(String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }

    }
}
