package Matrices;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        System.out.println("Ingresa un numero y te digo si se encuntra en la matriz");
        int num = entradas.nextInt();
        int[][] matriz = {
            {5,8,2},
            {10,3,7}
        };
        boolean encontrar = false;
        for (int filas = 0; filas < matriz.length; filas++){
            for (int columnas = 0; columnas < matriz[filas].length;columnas++){
                if (num == matriz[filas][columnas]){
                    encontrar = true;
                    break;
                }
            }
        }
        if (encontrar == true){
          System.out.println("El numero si esta en el array");  
        }
        else{
            System.out.println("El numero no esta en el array");
        }
        entradas.close();
    }
}
