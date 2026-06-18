package polimorfismo.personajes;

public class Guerrero extends Personaje {

    @Override
    public void atacar(){
        System.out.println("El guerrero ataca con la espada");
    }
}
