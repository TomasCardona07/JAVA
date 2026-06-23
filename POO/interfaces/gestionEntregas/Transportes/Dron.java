package interfaces.gestionEntregas.Transportes;

import interfaces.gestionEntregas.Interfaces.*; // SE IMPORTAN LAS INTERFACES

public class Dron extends Transporte implements Volador, Entregable { // HEREDA DE TRANSPORTE Y TIENE LAS INTERFACES DE ENTREGABLE Y VOLADOR

    //=========== CONSTRUCTOR =============
    public Dron(String nombre, int velMax){
        super(nombre, velMax);
    }


    public String getNombreVol(){
        return getNombre();
    }



    @Override
    public void volar(){
        System.out.println(getNombreVol() + " esta Volando");
    }


    // ========= ENTREGAR =========
    @Override
    public void entregar(){
        System.out.println(getNombre() + " Entregó un paquete");
    }
}
