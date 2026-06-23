package interfaces.gestionEntregas.Transportes;

// ======== CLASE PADRE ==========
public abstract class Transporte {

    //======= ATRIBUTOS =======
    private String nombre;
    private int velMax;

    //=========== CONSTRUCTOR =============
    Transporte(String nombre, int velMax){
        this.nombre = nombre;
        this.velMax = velMax;
    }
    //OBTENER NOMBRE
    public String getNombre(){
        return this.nombre; 
    }

    // OBTENER VELOCIDAD MÁXIMA
    public int getVelMax(){
        return this.velMax;
    }

    public abstract void entregar(); // TODOS DEBEN HACER ENTREGAS
}
