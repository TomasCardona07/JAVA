package herencia.animal;

public class Main {
    public static void main(String[] args) {
        Perro tobi = new Perro("TOBI");
        Animal percas = new Animal("El sapo");
        percas.hacerSonido();
        tobi.hacerSonido();
    }
}
