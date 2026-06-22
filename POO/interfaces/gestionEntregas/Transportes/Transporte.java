package interfaces.gestionEntregas.Transportes;

public abstract class Transporte {

    private String nombre;
    private int velMax;

    Transporte(String nombre, int velMax){
        this.nombre = nombre;
        this.velMax = velMax;
    }
    protected String getNombre(){
        return this.nombre; 
    }

    protected int getVelMax(){
        return this.velMax;
    }
}
