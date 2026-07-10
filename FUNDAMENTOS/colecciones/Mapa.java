package colecciones;
import java.util.*;
public class Mapa{
    String nombre;
    int edad;
    String id;
    Mapa(String nombre, int edad, String id){
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Map<String, Mapa> mapaEmpleados = new HashMap<>();
        System.out.println("Ingresa el nombre del empleado");
        String nombre = scr.nextLine();
        System.out.println("Ingrese la edad");
        int edad = Integer.parseInt(scr.nextLine());
        System.out.println("Ingrese el id");
        String id = scr.nextLine();
        mapaEmpleados.put(id, new Mapa(nombre, edad, id));
        System.out.println(mapaEmpleados.containsKey("12ñ"));
        scr.close();
    }
}