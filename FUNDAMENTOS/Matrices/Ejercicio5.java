package Matrices;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] matriz ={
            {1,2,3},
            {4,5,6},
            {7,8,10}
        };
        int contador = 0;
        for (int filas = 0; filas < matriz.length; filas++){
            for (int columnas = 0; columnas < matriz[filas].length;columnas++){
                if (matriz[filas][columnas] % 2 == 0){
                    contador++;
                }
            }
        }
        System.out.println("Hay " + contador + " numeros pares");
    }
}
