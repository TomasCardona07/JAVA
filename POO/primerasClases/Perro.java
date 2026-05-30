package primerasClases;
public class Perro {
    String nombre;
    void ladrar(){
    System.out.print("guau guau");
    }
    public static void main(String[] args) {
        Perro animal = new Perro();
        animal.nombre = "Tomi";
        System.out.println(animal.nombre);
        animal.ladrar();
    }
}
