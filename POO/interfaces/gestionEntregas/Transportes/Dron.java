package interfaces.gestionEntregas.Transportes;

import interfaces.gestionEntregas.Interfaces.Entregable;
import interfaces.gestionEntregas.Interfaces.Volador;

public class Dron extends Transporte implements Volador, Entregable {

    Dron(String nombre, int velMax){
        super(nombre, velMax);
    }

    @Override
    public void volar(){
        System.out.println(getNombre() + " esta volando");
    }

    @Override
    public void entregar(){
        System.out.println(getNombre() + " Entregó un paquete");
    }
}
