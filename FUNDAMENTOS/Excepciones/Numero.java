package Excepciones;
import java.util.Scanner;
public class Numero {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num;
        try {
            System.out.println("Ingresa un numero");
            num = Integer.parseInt(scr.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese numero");
        }

        scr.close();
    }
}
