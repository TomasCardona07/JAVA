package clases;
public class Bombillo {
    boolean encendido;
    public void brillar(){
        encendido = true;
        System.out.println("Lampara prendida");
    }
    public static void main(String[] args) {
        Bombillo lampara = new Bombillo();
        lampara.brillar();
    }
}
