package Excepciones;
import java.util.Scanner;
public class Combinacion_ciclo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num = - 1;
        while (num < 1){
            try {
                System.out.println("Ingresa un numero positivo");
                num = Integer.parseInt(scr.nextLine());
                if (num < 1 ) {
                    System.out.println("Numero incorrecto");
                }
                else{
                    System.out.println("BIEN");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero por favor");
            }
        }   
        scr.close();
    }
}
