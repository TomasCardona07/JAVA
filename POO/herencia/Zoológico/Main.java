package herencia.Zoológico;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("el animal");
        Perro firulais = new Perro("Firulais ");
        Gato michi = new Gato("Michi");
        animal.hacerSonido();
        firulais.hacerSonido();
        michi.hacerSonido();
    }
}
