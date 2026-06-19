package proyectos.torneoRPG;

public abstract class Personaje {
    protected String nombre;
    protected int nivel, vida;

    Personaje(String nombre, int nivel, int vida){
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
    }
    
    public abstract void atacar();
}
