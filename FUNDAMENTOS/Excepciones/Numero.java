package Excepciones;
import java.util.Scanner;
public class Numero {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num;
        try { //Se ejecuta una accion
            System.out.println("Ingresa un numero");
            num = Integer.parseInt(scr.nextLine());
        } catch (NumberFormatException e) { // NumberFormatException: excepción de Strings en datos numéricos
            System.out.println("Ingrese numero");
        }
        num = 1;
        System.out.println(num + " es 1"); // <- Para que cierre advertencia de variable
        scr.close();
    }
}
