package interfaces.gestionPagos.MetodosDePago;

import interfaces.gestionPagos.Interfaces.Reembolso;

public class Paypal extends MetodoPagos implements Reembolso { 

    public Paypal(String nombre, int identificador){
        super(nombre, identificador);
    }


    @Override
    public void pagar(){
        System.out.println(getNombre() + " Realizó el pago exitosamente");
    }

    @Override
    public void reembolso(){
        System.out.println("NOMBRE: " + getNombre());
        System.out.println("ESTADO: El reembolso se realizó correctamente");
    }
}
