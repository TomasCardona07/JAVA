package primerasClases;
public class Jugador {
    String nombre;
    int vidas;
    void atacar(){
        System.out.println(nombre + " ataca");
    }
    void vida(){
        System.out.println("vida actual: " + vidas);
    }
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        jugador1.nombre = "Tomas";
        jugador1.vidas = 100;
        jugador1.atacar();
        jugador1.vida();
    }
}
