package interfaces.gestionEntregas;
import interfaces.gestionEntregas.Transportes.*;
import interfaces.gestionEntregas.Interfaces.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ArrayList<Transporte> transportes = new ArrayList<>();
        System.out.println("BIENVENDO A NUESTRO SISTEMA DE GESTION DE ENTREGAS");
        int accion = 0;
        while (accion != 6) {
            System.out.println("Ingrese la accion que desea hacer:");
            System.out.println("[1] REGISTRAR MEDIO DE TRANSPORTE");
            System.out.println("[2] MOSTRAR MEDIOS REGISTRADOS");
            System.out.println("[3] EJECUTAR ENTREGAS");
            System.out.println("[4] EJECUTAR VUELOS");
            System.out.println("[5] BUSCAR MEDIO");
            System.out.println("[6] SALIR");
            accion = Integer.parseInt(scr.nextLine());
            while (accion < 1 || accion > 6) {
                System.out.println("Numero no valido, ingrese el valor nuevamente");
                accion = Integer.parseInt(scr.nextLine());
            }
            switch (accion) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}
