package interfaces.gestionPagos.MetodosDePago;

import interfaces.gestionPagos.Interfaces.Comprobante;

public class Transferencia extends MetodoPagos implements Comprobante{

    public Transferencia(String nombre, int identificador){
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
}
