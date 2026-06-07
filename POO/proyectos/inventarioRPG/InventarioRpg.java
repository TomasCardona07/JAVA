package proyectos.inventarioRPG;

public class InventarioRpg {
    private String nombre;
    private int nivel;
    private Arma[] inventario;
    InventarioRpg(String nombre, int nivel, Arma inventario){
        this.nombre = nombre;
        this.nivel = nivel;
        inventario = new Arma(nombre, nivel, nombre)
    }
    public String getNombre(){
        return nombre;
    }
    public int getNivel(){
        return nivel;
    }
    public static void main(String[] args) {
        Arma ak47 = new Arma("Matadora", 30, "Fusil");
        Arma m4 = new Arma("Tostadora", 24, "Fusil");
        Arma uzi = new Arma("Peque", 15, "Sub-Fusil");
        Arma benelli = new Arma("Maquina", 29, "Escopeta");
        Arma armas[] = {ak47,m4,uzi,benelli};
    }
}
