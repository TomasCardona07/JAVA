package interfaces.gestionEntregas.Transportes;

import interfaces.gestionEntregas.Interfaces.Entregable;
import interfaces.gestionEntregas.Interfaces.Volador;

public class Dron extends Transporte implements Volador, Entregable {

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

    @Override
    public void entregar(){
        System.out.println(getNombre() + " Entregó un paquete");
    }
}
