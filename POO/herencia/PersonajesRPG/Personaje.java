package herencia.PersonajesRPG;

//===== CLASE PADRE ======
public class Personaje {

    
    //===== ATRIBUTOS =====
    String nombre;
    int vida;

    //==== CONSTRUCTOR ====
    Personaje(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
    }


    //====== METODO MOSTRAR ESTADO =======
    public void mostrarEstado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
    }
}
