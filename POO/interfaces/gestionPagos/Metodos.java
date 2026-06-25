package interfaces.gestionPagos;
import interfaces.gestionPagos.Interfaces.Comprobante;
import interfaces.gestionPagos.Interfaces.Reembolso;
import interfaces.gestionPagos.MetodosDePago.MetodoPagos;
import java.util.Scanner;
import java.util.ArrayList;

public class Metodos {
    

    // ======= REGISTRAR MÉTODO DE PAGO ========
    public static byte registrar(Scanner scr){
        byte metodo = 0;
        do {
            System.out.println("Ingrese que metodo de pago desea registrar");
            System.out.println("[1] PAYPAL");
            System.out.println("[2] TRANFERENCIA");
            System.out.println("[3] TARJETA DE CREDITO");
            metodo = Byte.parseByte(scr.nextLine());
            if (metodo < 1 || metodo > 3) {
                System.out.println("¡¡¡ MÉTODO INCORRECTO !!!");
            }
        } while (metodo < 1 || metodo > 3);
        return metodo;
    }


    // ========== VALIDAR NUMERO DE IDENTIFICADOR (EL NUMERO ES DIFERENTE EN CADA PAGO) ===========
    public static int numRepetido(ArrayList<MetodoPagos> metodoPagos, Scanner scr){
        System.out.println("Ingrese el identificador del método de pago");
        int identificador = Integer.parseInt(scr.nextLine());
        for (int i = 0; i < metodoPagos.size(); i++){
            while (identificador == metodoPagos.get(i).getIdentificador() ) {
                System.out.println("Numero de identificador ya existe");
                System.out.println("Ingrese uno nuevo porfavor");
                identificador = Integer.parseInt(scr.nextLine());
                if (identificador != metodoPagos.get(i).getIdentificador()) {
                    break;
                }
            }
        }
        return identificador;
    }


    // ======== MOSTRAR SOLO METODOS QUE PUEDAN GENERAR COMPROBANTES ==========
    public static void mostrarComprobantes(ArrayList<MetodoPagos> metodoPagos){
        for (int i = 0; i < metodoPagos.size(); i++){
            if (metodoPagos.get(i) instanceof Comprobante) {
                ((Comprobante)metodoPagos.get(i)).comprobante();
            }
            else{
                System.out.println("Este metodo de pago no realiza comprobantes");
            }
        }
    }

    // ======== MOSTRAR SOLO METODOS QUE PUEDAN REALIZAR REEMBOLSOS ==========
    public static void reembolsar(ArrayList<MetodoPagos> metodoPagos){
        for (int i = 0; i < metodoPagos.size(); i++){
            if (metodoPagos.get(i) instanceof Reembolso) {
                ((Reembolso)metodoPagos.get(i)).reembolso();
            }
            else{
                System.out.println("Este metodo no realiza reembolsos");
            }
        }
    }


    // ======== BUSCAR PAGO POR NUMERO DE IDENTIFICADOR =======
    public static void buscarPago(ArrayList<MetodoPagos> metodoPagos, Scanner scr){
        System.out.println("Ingresa el numero de identificador del pago");
        int numIdentificador = Integer.parseInt(scr.nextLine());
        boolean pagoEncontrado = false;
        for (int i = 0; i < metodoPagos.size(); i++){
            if (numIdentificador == metodoPagos.get(i).getIdentificador()) {
                System.out.println("¡¡¡ PAGO ENCONTRADO !!!");
                System.out.println("NOMBRE: " + metodoPagos.get(i).getNombre());
                System.out.println("IDENTIFICADOR: " + metodoPagos.get(i).getIdentificador());
                pagoEncontrado = true;
                break;
            }
        }
        if (pagoEncontrado == false) {
            System.out.println("PAGO NO ENCONTRADO");
        }
    }
}
