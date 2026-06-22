package interfaces.gestionEntregas.Transportes;

import interfaces.gestionEntregas.Interfaces.Entregable;

public class Moto extends Transporte implements Entregable {

    public Moto(String nombre, int velMax){
        super(nombre, velMax);
    }

    @Override
    public void entregar(){
        System.out.println(getNombre() + " Entregó un paquete");
    }
}
