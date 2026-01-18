public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBool = num1 > num2;
        Boolean objBool = false;//autoboxing, se empaqueta
        Boolean objBool2 = Boolean.valueOf(false);
        Boolean objBool3 = Boolean.valueOf("false"); //se convierte

        System.out.println("primBool = " + primBool);
        System.out.println("objBool = " + objBool);
        System.out.println("objBool2 = " + objBool2);
        System.out.println("objBool3 = " + objBool3);

        System.out.println("(primBool == objBool2) = " + (primBool == objBool2));
        System.out.println("(objBool3 == objBool2) = " + (objBool3 == objBool2));
        System.out.println("objBool3.equals(objBool) = " + objBool3.equals(objBool));

        boolean bool = objBool2.booleanValue();
    }
}
