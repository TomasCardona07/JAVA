package herencia.vehiculos;

// ===== CLASE HIJA =====
public class Moto extends Vehiculo { // Heredo de vehiculo

    // ===== ATRIBUTOS =======
    String cilindraje;


    // ======= CONSTRUCTOR =======
    Moto(String cilindraje, String marca){
        super(marca);
        this.cilindraje = cilindraje;
    }

    @Override
    public void mostrarMarca() {
        System.out.println("La marca es: " + marca);
        System.out.println("El cilindraje es: " + cilindraje);
    }
}
