package interfaces.gestionEntregas.Transportes;

import interfaces.gestionEntregas.Interfaces.*; // SE IMPORTAN LAS INTERFACES

public class Camion extends Transporte implements Entregable{ // HEREDA DE TRANSPORTE Y TIENE LA INTERFAZ DE ENTREGABLE

    //=========== CONSTRUCTOR =============
    public Camion(String nombre, int velMax){
        super(nombre, velMax);
    }

    // ========= ENTREGAR =========
    @Override
    public void entregar(){
        System.out.println(getNombre() + " Entregó un paquete");
    }
}
