package interfaces.gestionPagos;

public abstract class MetodoPagos {
    private String nombre;
    private int identificador;

    MetodoPagos(String nombre, int identificador){
        this.nombre = nombre;
        this.identificador = identificador;
    }
    
    public String getNombre(){return this.nombre;}
    public int getIdentificador(){return this.identificador;}
    
    public abstract void pagar();
}
