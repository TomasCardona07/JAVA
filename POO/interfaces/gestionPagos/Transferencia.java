package interfaces.gestionPagos;

public class Transferencia extends MetodoPagos implements Comprobantes{

    Transferencia(String nombre, int identificador){
        super(nombre, identificador);
    }
    public void pagar(){
    }
    
    public void Comprobante(){
        System.out.println("El comprobante fue hecho exitosamente");
    }
}
