package interfaces.gestionPagos;

public class TarjCredito extends MetodoPagos implements Comprobantes {

    TarjCredito(String nombre, int identificador){
        super(nombre, identificador);
    }
    public void pagar(){
    }
    
    public void Comprobante(){
        System.out.println("El comprobante fue hecho exitosamente");
    }
}
