package Basico;
import java.util.Scanner; //Se importa el scanner para leer entradas
public class Entradas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Variable del Scanner y creacion
        System.out.println("Ingresa tu nombre");
        var nombre = entrada.nextLine(); //Input del usuario, se guarda en la variable
        System.out.println("Hola "+nombre);
        entrada.close(); //cierre del Scanner
    }
}

 