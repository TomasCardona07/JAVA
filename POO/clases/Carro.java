package clases;
public class Carro {
        String marca;
        String modelo;
        int anio;
    public static void main(String[] args) {
        Carro auto = new Carro();
        auto.marca = "JEEP";
        auto.modelo = "BUENO";
        auto.anio = 2025;
        System.out.println(auto.marca);
        System.out.println(auto.modelo);
        System.out.println(auto.anio);
    }
}