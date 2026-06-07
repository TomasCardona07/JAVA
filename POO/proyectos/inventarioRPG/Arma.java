package proyectos.inventarioRPG;

public class Arma {
    //Atributos de las armas
    String nombre;
    String tipo;
    int poder;

    //Constructor
    Arma(String nombre, int poder, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.poder = poder;
    }
}
