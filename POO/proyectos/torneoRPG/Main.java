package proyectos.torneoRPG;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ArrayList<Personaje> participantes = new ArrayList<>(); //ARRAY: "participantes" que solo guarda objetos de Personaje
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

					// ===== AGREGAR PARTICIPANTE ======
                case 1:
                    System.out.println("Ingresa el nombre del participante");
                    String nombre = scr.nextLine().toLowerCase();
                    System.out.println("Ingresa el nivel del participante");
                    int nivel = Integer.parseInt(scr.nextLine());
                    if (nivel <= 0) {
                        nivel = Metodos.numIncorrectos(scr); //Valida el numero, no permite menores a 1
                    }
                    System.out.println("Ingresa los puntos de vida del participante");
                    int vida = Integer.parseInt(scr.nextLine());
                    if (vida <= 0) {
                        vida = Metodos.numIncorrectos(scr); //Valida el numero, no permite menores a 1
                    }
                    int persUsuario = Metodos.validacionPersonaje(scr); // SE VALIDA LA ELECCIÓN DEL PERSONAJE 
                    switch (persUsuario) {
							//Crea objetos y los guarda en el array
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

					// =========== MOSTRAR PARTICIPANTES ===========
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

					// =========== PARTICIPANTE CON MAS VIDA ============
                case 3:
                    if (!participantes.isEmpty()) {
                        String pConMasVida = Metodos.pConMasVida(participantes); //Se llama al metodo para calcular al participante con mas vida
                        System.out.println("El participante con mas vida es " + pConMasVida);
                    }
                    else{
                        System.out.println("No hay participantes aun");
                    }
                    break;

					// ============= PROMEDIO DE NIVEL =============
                case 4:
                    if (!participantes.isEmpty()) {
                        double promedio = Metodos.promedioNivel(participantes); // Se llama al metodo para calcular el promedio
                        System.out.println("El nivel promedio de los participantes es:  " + promedio);
                    }
                    else{
                        System.out.println("No hay participantes aun");
                    }
                    break;

					// =========== BUSCAR PARTICIPANTES ===========
                case 5:
                    if (!participantes.isEmpty()) {
                        System.out.println("Ingrese el nombre del usuario que desea buscar");
                        Metodos.buscarPartic(participantes,scr); // Se llama al metodo y se muestra el usuario si se encuentra, de lo contrario le muestra que no se encuentra
                    }
                    else{
                        System.out.println("No hay participantes aun");
                    }
                    break;

					// ========== MOSTRAR ACCIONES DE COMBATE DE CADA PARTICIPANTE ==========
                case 6:
                    if (!participantes.isEmpty()) {
                        for (Personaje personaje : participantes) {
                            personaje.atacar(); //Metodo atacar
                            System.out.println("----------------");
                        }
                    }
                    else{
                        System.out.println("No hay participantes aun");
                    }
                    break;

					// ========= SALE DEL SISTEMA =======
                default:
                    System.out.println("GRACIAS POR USAR NUESTRO SISTEMA :)");
                    break;
            }
        }
    }
}
