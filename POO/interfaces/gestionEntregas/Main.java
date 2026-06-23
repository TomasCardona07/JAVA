package interfaces.gestionEntregas;
import interfaces.gestionEntregas.Transportes.*; // importa la carpeta de transportes
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
                    int eleccTransp = Metodos.validacionTransporte(scr); //EJECUTA Y VALIDA EL NUMERO INGRESADO
                    String nombre = Metodos.validarNombre(transportes, scr); //Valida si hay nombre repetido
                    System.out.println("Ingresa la velocidad maxima");
                    int velMax = Integer.parseInt(scr.nextLine());

                    // CREA EL VEHICULO SEGÚN ELECCIÓN DEL USUARIO
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
                        Metodos.mostrarVehiculos(transportes); // FUNCIÓN MOSTRAR VEHICULOS
                    }
                    else{
                        System.out.println("No hay vehiculos registrados");
                    }
                    break;
                case 3:
                    if (!transportes.isEmpty()) {
                        for (Transporte transporte : transportes) {
                            transporte.entregar(); //MUESTRA LOS VEHICULOS QUE ENTREGAN
                        }
                    }
                    else{
                        System.out.println("No hay vehiculos registrados");
                    }
                    break;
                case 4:
                    if (!transportes.isEmpty()) {
                        Metodos.mostrarVoladores(transportes); //MUESTRA LOS VEHICULOS QUE VUELAN
                    }
                    else{
                        System.out.println("No hay vehiculos registrados");
                    }
                    break;
                case 5:
                    if (!transportes.isEmpty()) {
                        Metodos.buscarVehiculos(transportes, scr); // BUSCA Y MUESTRA EL VEHICULO
                    }
                    else{
                        System.out.println("No hay vehiculos registrados");
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
