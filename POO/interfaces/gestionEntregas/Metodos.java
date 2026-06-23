package interfaces.gestionEntregas;

import java.util.ArrayList;
import java.util.Scanner;

import interfaces.gestionEntregas.Interfaces.*;
import interfaces.gestionEntregas.Transportes.Transporte;

public class Metodos {

    // ========= VALIDACIÓN DE ELECCIÓN DE TRANSPORTE ==========
    public static int validacionTransporte(Scanner scr){
        System.out.println("¿Cuál medio de transporte deseas registrar?");
        System.out.println("[1] Camión");
        System.out.println("[2] Moto");
        System.out.println("[3] Dron");
        int eleccTransp = Integer.parseInt(scr.nextLine());
        while (eleccTransp < 1 || eleccTransp > 3) {
            System.out.println("Numero no valido, ingreselo nuevamente");
            eleccTransp = Integer.parseInt(scr.nextLine());
        }
        return eleccTransp;
    }


    // ========== VALIDA NOMBRE REPETIDO ============
    public static String validarNombre(ArrayList<Transporte> transportes, Scanner scr){
        System.out.println("Ingresa el nombre del Vehiculo");
        String nombre = scr.nextLine().toLowerCase();
        for (Transporte transporte : transportes) {
            while (transporte.getNombre().equals(nombre)) {
                System.out.println("El nombre ya existe ingrese otro por favor");
                nombre = scr.nextLine().toLowerCase();
            }
        }
        return nombre;
    }

    // ========== MUESTRA VEHICULOS REGISTRADOS ===============
    public static void mostrarVehiculos(ArrayList<Transporte> transportes) {
        for (Transporte transporte : transportes) {
            System.out.println("Nombre: "+transporte.getNombre());
            System.out.println("Vel Máxima: "+transporte.getVelMax());
            System.out.println("=============================");
        }
    }

    
    // ========= MUESTRA SOLO VECHICULOS QUE PUEDEN VOLAR ============
    public static void mostrarVoladores(ArrayList<Transporte> transportes){
        for (Transporte transporte : transportes) {
            if (transporte instanceof Volador) {
                ((Volador)transporte).volar();
            }
            else{
                System.out.println("El vehiculo " + transporte.getNombre() + " no puede volar");
            }
            System.out.println("-------------------");
        }
    }

    // ========== RECIBE INPUT DEL USUARIO, BUSCA Y MUESTRA EL VEHICULO ==========
    public static void buscarVehiculos(ArrayList<Transporte> transportes, Scanner scr){
        System.out.println("Ingrese el nombre del vehiculo que desea buscar");
        String buscarVehiculo = scr.nextLine().toLowerCase();
        boolean vehiculoEncontrado = false;
        for (Transporte transporte : transportes) {
            if (transporte.getNombre().equals(buscarVehiculo)) {
                System.out.println("Vehiculo encontrado");
                System.out.println("NOMBRE: " + transporte.getNombre());
                System.out.println("VELOCIDAD MAXIMA: " + transporte.getVelMax());
                vehiculoEncontrado = true;
            }
        }
        if (vehiculoEncontrado == false) {
            System.out.println("Vehiculo no encontrado");
        }
    }
}