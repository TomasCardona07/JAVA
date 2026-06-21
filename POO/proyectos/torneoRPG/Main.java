package proyectos.torneoRPG;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ArrayList<Personaje> participantes = new ArrayList<>();
        int accion = 0;
        while (accion != 7) {
            System.out.println("Ingrese que accion desea hacer");
            System.out.println("[1] REGISTRAR PARTICIPANTE");
            System.out.println("[2] MOSTRAR PARTICIPANTES");
            System.out.println("[3] MOSTRAR PARTICIPANTE CON MAS VIDA");
            System.out.println("[4] MOSTRAR PROMEDIO DE NIVEL");
            System.out.println("[5] BUSCAR PARTICIPANTE");
            System.out.println("[6] EJECUTAR ACCIONES DE COMBATE");
            System.out.println("[7] SALIR");
            accion = Integer.parseInt(scr.nextLine());
            while (accion > 7 || accion <= 0) {
                System.out.println("Numero no valido, ingreselo nuevamente");
                accion = Integer.parseInt(scr.nextLine());
            }
            switch (accion) {
                case 1:
                    System.out.println("Ingresa el nombre del participante");
                    String nombre = scr.nextLine().toLowerCase();
                    System.out.println("Ingresa el nivel del participante");
                    int nivel = Integer.parseInt(scr.nextLine());
                    if (nivel <= 0) {
                        nivel = Metodos.numIncorrectos(scr);
                    }
                    System.out.println("Ingresa los puntos de vida del participante");
                    int vida = Integer.parseInt(scr.nextLine());
                    if (vida <= 0) {
                        vida = Metodos.numIncorrectos(scr);
                    }
                    int persUsuario = Metodos.validacionPersonaje(scr); // SE VALIDA LA ELECCIÓN DEL PERSONAJE 
                    switch (persUsuario) {
                        case 1:
                            participantes.add(new Arquero(nombre, nivel, vida));
                            break;
                        case 2:
                            participantes.add(new Mago(nombre, nivel, vida));
                            break;
                        default:
                            participantes.add(new Guerrero(nombre, nivel, vida));
                            break;
                    }
                    break; 
                case 2:
                    if (!participantes.isEmpty()) {
                        for (Personaje personaje : participantes) {
                            System.out.println("Nombre: " + personaje.nombre);
                            System.out.println("Nivel : " + personaje.nivel);
                            System.out.println("Puntos de vida: " + personaje.vida);
                            System.out.println("======================");
                        }
                    }
                    else{
                        System.out.println("No hay participantes aún");
                    }
                    break;
                case 3:
                    if (!participantes.isEmpty()) {
                        String pConMasVida = Metodos.pConMasVida(participantes);
                        System.out.println("El participante con mas vida es " + pConMasVida);
                    }
                    else{
                        System.out.println("No hay participantes aun");
                    }
                    break;
                case 4:
                    if (!participantes.isEmpty()) {
                        double promedio = Metodos.promedioNivel(participantes);
                        System.out.println("El nivel promedio de los participantes es:  " + promedio);
                    }
                    else{
                        System.out.println("No hay participantes aun");
                    }
                    break;
                case 5:
                    if (!participantes.isEmpty()) {
                        System.out.println("Ingrese el nombre del usuario que desea buscar");
                        Metodos.buscarPartic(participantes,scr);
                    }
                    else{
                        System.out.println("No hay participantes aun");
                    }
                    break;
                case 6:
                    if (!participantes.isEmpty()) {
                        for (Personaje personaje : participantes) {
                            personaje.atacar();
                            System.out.println("----------------");
                        }
                    }
                    else{
                        System.out.println("No hay participantes aun");
                    }
                    break;
                default:
                    System.out.println("GRACIAS POR USAR NUESTRO SISTEMA :)");
                    break;
            }
        }
    }
}
