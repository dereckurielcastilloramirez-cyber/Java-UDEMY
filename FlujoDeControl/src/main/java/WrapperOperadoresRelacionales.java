public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        //SON OBJETOS QUE CONTIENEN UN VALOR ANIDADO DENTRO DE LA INSTANCIA DEL INTEGER
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto : " + (num1 == num2)); // compara por instancia NO por valor; SOLO HASTA 127 HACE AUTOBOXING

        num2 = 1000; //contienen mismo valor pero no misma instancia

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto : " + (num1 == num2)); //== compara por objeto de la instancia

        System.out.println("Tienen el mismo valor = " + (num1.equals(num2))); //compara por valor
        System.out.println("Tienen el mismo valor = " + (num1.intValue() == num2.intValue())); //compara primitivos por valor

        num2 = 100;

        boolean condicion = num2 > num1; //auto outboxing y si los compara aun siendo objeto y primitivo
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num2.intValue() > num1.intValue(); //auto outboxing y si los compara aun siendo objeto y primitivo
        System.out.println("condicion = " + condicion2);
    }
}
