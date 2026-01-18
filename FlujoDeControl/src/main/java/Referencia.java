class Persona{
    //variable privada de clase persona
    private String nombre;

    //metodo especial para modificar nombre
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre; //referirse a la clase con private
    }
    public String leerNombre(){
        return this.nombre;
    }

}

 class Referencia {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Uriel");

        System.out.println("Metodo main");
        System.out.println("iniciamos el main con i = " + persona.leerNombre()); // al estar en private persona.nombre no es valido, si fuera public si se podria

        test(persona);

        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("FIN DEL MAIN");
    }
    //nuevo metodo que no devuelve nada
    public static void test(Persona persona){
        System.out.println("iniciamos metodo test ");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza metodo test");
    }
}
