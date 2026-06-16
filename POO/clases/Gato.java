package clases;
public class Gato {
    String nombre;
    int edad;
    public void maullar(){
        System.out.println("Miau Miau");
    }
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.nombre = "Tom";
        gato.edad = 3;
        System.out.println("mi nombre es: " + gato.nombre);
        System.out.println("Mi edad es: " + gato.edad);
        gato.maullar();
    }
}
