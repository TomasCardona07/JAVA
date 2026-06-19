package proyectos.torneoRPG;

public class Arquero extends Personaje {
    Arquero(String nombre, int nivel, int vida){
        super(nombre, nivel, vida);
    }
    public void atacar(){
        System.out.println(nombre + " Lanza un flechazo");
    }
}
