package proyectos.inventarioRPG;
import java.util.Scanner; //Importar escaner
public class InventarioRpg {
    Scanner src = new Scanner(System.in); //Crear escaner

    //Atributos
    private String nombre;
    private int nivel;
    private Arma[] inventario; //Se crea lista vacia donde se guardaran las armas

    //Constructor
    InventarioRpg(String nombre, int nivel){
        this.nombre = nombre;
        this.nivel = nivel;
        inventario = new Arma[5]; //Se crean 5 espacios
    }
    public String getNombre(){ //Se obtiene el nombre del jugador
        return nombre;
    }
    public int getNivel(){ //Se obtiene nivel del jugador
        return nivel;
    }
    public Arma[] getInventario(){ //Se obtiene el inventario del jugador (lista vacia)
        return inventario;
    }
    //Agregar Arma
    public void agregarArma(Arma arma){
        for (int i = 0; i < inventario.length; i++){
            if (inventario[i] == null) {
                inventario[i] = arma;
                break;
            }
        }
    }

    //Mostrar Perfil
    public void mostrarPerfil(){
        System.out.println("Jugador: " + nombre);
        System.out.println("Niivel: " + nivel);
        for (int i = 0; i < inventario.length; i++){
            if (inventario[i] != null) {
                System.out.println("Arma: " + inventario[i].nombre);
            }
        }
    }

    //Arma mas poderosa
    public void armaPoderosa(){
        int armaPoderosa = inventario[0].poder;
        String armaPoderosaNombre = inventario[0].nombre;
        for (int i = 1; i < inventario.length; i++){
            if (inventario[i] != null) {
                if (inventario[i].poder > armaPoderosa) {
                armaPoderosa = inventario[i].poder;
                armaPoderosaNombre = inventario[i].nombre;
                }
            }
        }
        System.out.println("El arma mas poderosa es: " + armaPoderosaNombre);
    }

    //Poder total de las armas
    public void poderTotal(){
        int poderTotal = inventario[0].poder;
        for (int i = 1; i < inventario.length; i++){
            if (inventario[i] != null) {
                poderTotal += inventario[i].poder;
            }
        }
        System.out.println("El poder total de todas las armas es: " + poderTotal);
    }

    //Buscar arma
    public void buscarArma(){
        System.out.println("Ingresa el nombre del arma que desea buscar");
        String nombreArma = src.nextLine().toLowerCase();
        boolean armaEncontrada = false;
        for (int i = 0; i < inventario.length; i++){
            if (inventario[i] != null) {
                if (nombreArma.equals(inventario[i].nombre)) {
                System.out.println("Arma encontrada, esta en la posicion: " + (i+1) + " del inventario");
                armaEncontrada = true;
                break;
                }
            }
        }
        if (armaEncontrada == false) {
            System.out.println("Arma no encontrada");
        }
    }

    //Main
    public static void main(String[] args) {
        Arma ak47 = new Arma("matadora", 30, "Fusil");
        Arma m4 = new Arma("tostadora", 24, "Fusil");
        Arma uzi = new Arma("peque", 15, "Sub-Fusil");
        Arma benelli = new Arma("maquina", 29, "Escopeta");
        InventarioRpg player1 = new InventarioRpg("Tomas", 29);
        player1.agregarArma(benelli);
        player1.agregarArma(ak47);
        player1.agregarArma(uzi);
        player1.agregarArma(m4);
        player1.mostrarPerfil();
        player1.armaPoderosa();
        player1.poderTotal();
        player1.buscarArma();
    }
}
