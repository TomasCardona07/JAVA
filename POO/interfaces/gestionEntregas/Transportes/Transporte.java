package interfaces.gestionEntregas.Transportes;

public abstract class Transporte {

    private String nombre;
    private int velMax;

    Transporte(String nombre, int velMax){
        this.nombre = nombre;
        this.velMax = velMax;
    }
    public String getNombre(){
        return this.nombre; 
    }

    public int getVelMax(){
        return this.velMax;
    }
    public abstract void entregar();
}
