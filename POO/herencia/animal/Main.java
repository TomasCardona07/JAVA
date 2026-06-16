package herencia.animal;

public class Main {
    public static void main(String[] args) {
        Perro tobi = new Perro("TOBI"); // CLASE PADRE
        Animal percas = new Animal("El sapo"); // CLASE HIJA
        percas.hacerSonido(); // ACCION ANIMAL
        tobi.hacerSonido(); // ACCION PERRO
    }
}
