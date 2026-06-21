package proyectos.torneoRPG;

public class Arquero extends Personaje { //Hija, hereda de Personaje


    // ======== CONSTRUCTOR ==========
    Arquero(String nombre, int nivel, int vida){
        super(nombre, nivel, vida);
    }

    // ======= METODO ATACAR =========
    @Override
    public void atacar(){
        System.out.println(nombre + " Lanza un flechazo");
    }
}
