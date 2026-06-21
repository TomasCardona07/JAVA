package proyectos.torneoRPG;

// ========== CLASE PADRE ========
public abstract class Personaje {

    // ====== ATRIBUTOS PROTEGIDOS ========
    protected String nombre;
    protected int nivel, vida;

    // ======== CONSTRUCTOR ==========
    Personaje(String nombre, int nivel, int vida){
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
    }
    
    // ======= METODO ABSTRACTO: ATACAR ==========
    public abstract void atacar();
}
