package polimorfismo.personajes;

public class Mago extends Personaje {

    @Override
    public void atacar(){
        System.out.println("El mago lanza un hechizo");
    }
}
