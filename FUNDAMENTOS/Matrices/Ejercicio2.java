package Matrices;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int acumulador = 0;
        for (int filas = 0; filas < matriz.length; filas++){
            for (int columnas = 0; columnas < matriz[filas].length; columnas++){
                acumulador += matriz[filas][columnas];
            }
        }
        System.out.println(acumulador);
    }
}
