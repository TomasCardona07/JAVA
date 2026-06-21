package proyectos.torneoRPG;

public class Mago extends Personaje { //Hija, hereda de Personaje

    // ======== CONSTRUCTOR ==========
    Mago(String nombre, int nivel, int vida){
        super(nombre, nivel, vida);
    }

    // ======= METODO ATACAR =========
    @Override
    public void atacar(){
        System.out.println(nombre + " Lanza un hechizo");
    }
}