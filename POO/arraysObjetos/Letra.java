package arraysObjetos;
import java.util.Scanner;

public class Letra {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        String palabra = scr.next().toLowerCase();
        System.out.println("Ingresa una letra");
        char letra = scr.next().toLowerCase().charAt(0);
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++){
            if (palabra.charAt(i) == letra) {
                contador++;
            }
        }
        if (contador > 1){
            System.out.println("La letra " + letra + " sale " + contador + " veces en " + palabra);
        }
        else if (contador == 1){
            System.out.println("La letra " +letra + " solo sale una vez en " + palabra);
        }
        else{
            System.out.println("La letra " + letra + " no sale en la palabra " + palabra);
        }
        scr.close();
    }
}
