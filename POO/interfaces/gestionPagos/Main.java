package interfaces.gestionPagos;

import java.util.Scanner;
import java.util.ArrayList;

import interfaces.gestionPagos.MetodosDePago.*;
import interfaces.gestionPagos.MetodosDePago.MetodoPagos;
import interfaces.gestionPagos.MetodosDePago.TarjCredito;
import interfaces.gestionPagos.MetodosDePago.Transferencia;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ArrayList<MetodoPagos> metodoPagos = new ArrayList<>();
        int accion = 0;
        while (accion != 7) {
            do {
            System.out.println("Ingrese la acción que desea realizar");
            System.out.println("[1] REGISTRAR METODO DE PAGO");
            System.out.println("[2] MOSTRAR METODOS REGISTRADOS");
            System.out.println("[3] PROCESAR PAGOS");
            System.out.println("[4] GENERAR COMPROBANTES");
            System.out.println("[5] REALIZAR REEMBOLSOS");
            System.out.println("[6] BUSCAR METODO DE PAGO");
            System.out.println("[7] SALIR");
            accion = Integer.parseInt(scr.nextLine());
            if (accion < 1 || accion > 7) {
                System.out.println("¡¡¡ ACCIÓN NO VÁLIDA !!!");
            }
            }while (accion <1 || accion > 7);
        
            switch (accion) {
                case 1:
                    byte metodo = Metodos.registrar(scr);
                    System.out.println("Ingrese el nombre del metodo de pago");
                    String nombre = scr.nextLine().toLowerCase();
                    int identificador = Metodos.numRepetido(metodoPagos, scr);
                    switch (metodo) {
                        case 1:
                            metodoPagos.add(new Paypal(nombre, identificador));
                            break;
                        case 2:
                            metodoPagos.add(new Transferencia(nombre, identificador));
                            break;
                        default:
                            metodoPagos.add(new TarjCredito(nombre, identificador));
                            break;
                    }
                    break;
                case 2:
                    if (!metodoPagos.isEmpty()) {
                        for (int i = 0; i < metodoPagos.size(); i++){
                            System.out.println("NOMBRE: " + metodoPagos.get(i).getNombre());
                            System.out.println("IDENTIFICADOR: " + metodoPagos.get(i).getIdentificador());
                            System.out.println("======================");
                        }
                    }
                    else{
                        System.out.println("No hay pagos registrados");
                    }
                    break;
                case 3:
                    if (!metodoPagos.isEmpty()) {
                        for(int i = 0; i < metodoPagos.size(); i++){
                            metodoPagos.get(i).pagar();
                            System.out.println("===============");
                        }
                    }
                    else{
                        System.out.println("No hay pagos registrados");
                    }
                    break;
                case 4:
                    if (!metodoPagos.isEmpty()) {
                        Metodos.mostrarComprobantes(metodoPagos);
                    }
                    else{
                        System.out.println("No hay pagos registrados");
                    }
                    break;
                case 5:
                    if (!metodoPagos.isEmpty()) {
                        Metodos.reembolsar(metodoPagos);
                    }
                    else{
                        System.out.println("No hay pagos registrados");
                    }
                    break;
                case 6:
                    if (!metodoPagos.isEmpty()) {
                        Metodos.buscarPago(metodoPagos, scr);
                    }
                    else{
                        System.out.println("No hay pagos registrados");
                    }
                    break;
                default:
                    System.out.println("GRACIAS POR USAR NUESTRO SISTEMA :)");
                    break;
            } 
        }
        scr.close();           
    }
}    
    

