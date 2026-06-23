package interfaces.gestionEntregas;
import interfaces.gestionEntregas.Transportes.*; // importa la carpeta de transportes
import interfaces.gestionEntregas.Interfaces.*; // Importa la carpeta de interfaces
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
                    System.out.println("¿Cuál medio de transporte deseas registrar?");
                    System.out.println("[1] Camión");
                    System.out.println("[2] Moto");
                    System.out.println("[3] Dron");
                    int eleccTransp = Integer.parseInt(scr.nextLine());
                    while (eleccTransp < 1 || eleccTransp > 3) {
                        System.out.println("Numero no valido, ingreselo nuevamente");
                        eleccTransp = Integer.parseInt(scr.nextLine());
                    }
                    System.out.println("Ingresa el nombre del Vehiculo");
                    String nombre = scr.nextLine().toLowerCase();
                    System.out.println("Ingresa la velocidad maxima");
                    int velMax = Integer.parseInt(scr.nextLine());
                    switch (eleccTransp) {
                        case 1:
                            transportes.add(new Camion(nombre, velMax));
                            break;
                        case 2:
                            transportes.add(new Moto(nombre, velMax));
                            break;
                        default:
                            transportes.add(new Dron(nombre, velMax));
                            break;
                    }
                    break;
                case 2:
                    if (!transportes.isEmpty()) {
                        for (Transporte transporte : transportes) {
                            System.out.println("Nombre: "+transporte.getNombre());
                            System.out.println("Vel Máxima: "+transporte.getVelMax());
                            System.out.println("=============================");
                        }
                    }
                    else{
                        System.out.println("No hay vehiculos registrados");
                    }
                    break;
                case 3:
                    if (!transportes.isEmpty()) {
                        for (Transporte transporte : transportes) {
                            transporte.entregar();
                        }
                    }
                    else{
                        System.out.println("No hay vehiculos registrados");
                    }
                    break;
                case 4:
                    if (!transportes.isEmpty()) {
                        for (Transporte transporte : transportes) {
                            if (transporte instanceof Volador) {
                                ((Volador)transporte).volar();
                            }
                        }
                    }
                    else{
                        System.out.println("No hay vehiculos registrados");
                    }
                    break;
                case 5:
                    if (!transportes.isEmpty()) {
                        System.out.println("Ingrese el nombre del vehiculo que desea buscar");
                        String buscarVehiculo = scr.nextLine().toLowerCase();
                        for (Transporte transporte : transportes) {
                            if (transporte.getNombre().equals(buscarVehiculo)) {
                                System.out.println("Vehiculo encontrado");
                                System.out.println("NOMBRE: " + transporte.getNombre());
                                System.out.println("VELOCIDAD MAXIMA: " + transporte.getVelMax());
                            }
                        }
                    }
                    else{
                        System.out.println("No hay vehiculos regitrados");
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
