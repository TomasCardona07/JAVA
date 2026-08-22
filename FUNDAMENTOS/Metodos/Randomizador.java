package Metodos;
import java.util.*;
public class Randomizador {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scr = new Scanner(System.in);
        int numEncontrar = random.nextInt(101);
        Boolean encontrado = false;
        int num = -1;
        int contador = 0;
        while (!encontrado) {
            System.out.println("Ingrese un numero");
            num = Integer.parseInt(scr.nextLine());
            if (num == numEncontrar) {
                System.out.println("FELICIDADES, HAS ENCONTRADO EL NUMERO");
                System.out.println("Numero encontrado " + numEncontrar);
                System.out.println("LO ENCONTRASTE EN: " + contador + " INTENTOS");
                encontrado = true;
            }
            else if (num > numEncontrar){
                System.out.println("El numero a encontrar es menor que el ingresado");
                contador++;
            }
            else{
                System.out.println("El numero a encontrar es mayor que el ingresado");
                contador++;
            }
        }
        scr.close();
    }
}
