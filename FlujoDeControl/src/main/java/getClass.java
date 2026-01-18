import java.lang.reflect.Method;

public class getClass {
    public static void main(String[] args) {
        String texto = "Hola";
        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass.getPackageName() = " + strClass);
        
        for(Method metodo : strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
        System.out.println("intClass.getPackage() = " + intClass.getPackage());

        Class objClass = intClass.getSuperclass().getSuperclass();

        System.out.println("objClass = " + objClass);

    }
}
