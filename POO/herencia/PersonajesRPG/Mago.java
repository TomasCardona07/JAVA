package herencia.PersonajesRPG;

// ===== CLASE HIJA =====
public class Mago extends Personaje {

    // ==== ATRIBUTOS ====
    double magia;


    // ==== CONSTRUCTOR =====
    Mago(String nombre, int vida, double magia){
        super(nombre,vida);
        this.magia = magia;
    }

    
    // ===== SOBREESCRIBIR METODO MOSTRAR ESTADO =======
    @Override
    public void mostrarEstado(){
        System.out.println("Nombre del mago: " + nombre);
        System.out.println("Vida del mago: " + vida);
        System.out.println("Magia: " + magia);
    }
}
