package interfaces.gestionPagos.MetodosDePago;

import interfaces.gestionPagos.Interfaces.Comprobante;
import interfaces.gestionPagos.Interfaces.Reembolso;

public class TarjCredito extends MetodoPagos implements Comprobante,Reembolso {

    public TarjCredito(String nombre, int identificador){
        super(nombre, identificador);
    }
    @Override
    public void pagar(){
        System.out.println(getNombre() + " Realizó el pago exitosamente");
    }
    
    @Override
    public void comprobante(){
        System.out.println("NOMBRE: " + getNombre());
        System.out.println("ESTADO: El comprobante fue hecho exitosamente");
    }

    @Override
    public void reembolso(){
        System.out.println("NOMBRE: " + getNombre());
        System.out.println("ESTADO: El reembolso se realizó correctamente");
    }
}
