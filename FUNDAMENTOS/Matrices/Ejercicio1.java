package Matrices;
public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] matriz ={
            {1,2,3},
            {4,5,6}, //Se desea mostrar solo esta fila
            {7,8,9}
        };
        for (int columnas = 0; columnas < matriz[1].length; columnas++){
            System.out.println(matriz[1][columnas]);
        }
    }
}
