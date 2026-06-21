package proyectos.torneoRPG;

public class Guerrero extends Personaje { //Hija, hereda de Personaje


    // ======== CONSTRUCTOR ==========
    Guerrero(String nombre, int nivel, int vida){
        super(nombre, nivel, vida);
    }

    // ======= METODO ATACAR =========
    @Override
    public void atacar(){
        System.out.println(nombre + " pega con su espada");
    }
}
