package proyectos.torneoRPG;

public class Guerrero extends Personaje {
    Guerrero(String nombre, int nivel, int vida){
        super(nombre, nivel, vida);
    }
    public void atacar(){
        System.out.println(nombre + " pega con su espada");
    }
}
