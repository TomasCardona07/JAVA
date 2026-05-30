package primerasClases;
public class Persona {
    String nombre;
    String edad;
    void presentarse(){
        System.out.println("Hola, me llamo " + nombre);
    }
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Tomas";
        persona.presentarse();
    }
}
