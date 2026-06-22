package interfaces.gestionEntregas.Transportes;

import interfaces.gestionEntregas.Interfaces.Entregable;

public class Camion extends Transporte implements Entregable{

    public Camion(String nombre, int velMax){
        super(nombre, velMax);
    }

    @Override
    public void entregar(){
        System.out.println(getNombre() + " Entregó un paquete");
    }
}
