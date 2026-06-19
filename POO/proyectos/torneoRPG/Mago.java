package proyectos.torneoRPG;

public class Mago extends Personaje {

    Mago(String nombre, int nivel, int vida){
        super(nombre, nivel, vida);
    }
    public void atacar(){
        System.out.println(nombre + " Lanza un hechizo");
    }
}