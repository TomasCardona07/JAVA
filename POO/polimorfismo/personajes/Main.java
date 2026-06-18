package polimorfismo.personajes;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago();
        Guerrero guerrero = new Guerrero();
        Arquero arquero = new Arquero();
        Personaje[] personajes = {mago, arquero, guerrero};
        for (int i = 0; i < personajes.length; i++){
            personajes[i].atacar();
        }
    }
}
