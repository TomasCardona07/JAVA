package proyectos.torneoRPG;

import java.util.Scanner;
import java.util.ArrayList;
public class Metodos {


    // ======== VALIDACION DE ELECCIÓN DE PERSONAJE ===============
    public static int validacionPersonaje(Scanner scr){
        System.out.println("elije personaje:");
        System.out.println("[1] ARQUERO");
        System.out.println("[2] MAGO");
        System.out.println("[3] GUERRERO");
        int persUsuario = Integer.parseInt(scr.nextLine());
        while (persUsuario > 3 || persUsuario <= 0) {
            System.out.println("Numero incorrecto, ingreselo nuevamente");
            persUsuario = Integer.parseInt(scr.nextLine());
        }
        return persUsuario;
    }


    // ======== PROMEDIO DE NIVEL ================
    public static double promedioNivel(ArrayList<Personaje> participantes){
        int suma = 0;
        for (Personaje personaje : participantes) {
            suma += personaje.nivel;
        }
        double promedio = suma / participantes.size();
        return promedio;
    }

    // ======== VALIDACIÓN NUMEROS NEGATIVOS =======
    public static int numIncorrectos(Scanner scr){
        int validacion = -1;
        while (validacion <= 0) {
            System.out.println("Numero ingresado no valido");
            System.out.println("Por favor ingresalo nuevamente");
            validacion = Integer.parseInt(scr.nextLine());
        }
        return validacion;
    }

    // ======= PARTICIPANTE CON MAS VIDA ==========
    public static String pConMasVida(ArrayList<Personaje> participantes){
        int masVida = 0;
        String masVidaNombre = "";
        for (Personaje personaje : participantes) {
            if (personaje.vida > masVida) {
                masVida = personaje.vida;
                masVidaNombre = personaje.nombre;
            }
        }
        return masVidaNombre;
    }

    //========== BUSCAR PARTICIPANTE =========
    public static Boolean buscarPartic(ArrayList<Personaje> participantes, Scanner scr){
        boolean participanteEncontrado = false;
        String encontrarParticipante = scr.nextLine().toLowerCase();
        for (Personaje personaje : participantes) {
            if (encontrarParticipante.equals(personaje.nombre)) {
                System.out.println("¡¡¡PARTICIPANTE ENCONTRADO!!!");
                System.out.println("Nombre : "+ personaje.nombre);
                System.out.println("NIVEL: "+ personaje.nivel);
                System.out.println("PUNTOS DE VIDA: " + personaje.vida);
                participanteEncontrado = true;
                break;
            }
        }
        if (participanteEncontrado == false) {
            System.out.println("PARTICIPANTE NO ENCONTRADO");
        }
        return participanteEncontrado;
    }
}
