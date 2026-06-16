package herencia.vehiculos;

// ===== CLASE PADRE ======
public class Vehiculo {
    
    // ===== ATRIBUTOS =====
    String marca;

    // ===== CONSTRUCTOR =====
    Vehiculo(String marca){
        this.marca = marca;
    }

    // ======= METODO MOSTRAR MARCA ======
    public void mostrarMarca(){
        System.out.println("la marca es: " + marca);
    }
}
