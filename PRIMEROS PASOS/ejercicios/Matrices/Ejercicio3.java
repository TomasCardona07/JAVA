package ejercicios.Matrices;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] matriz = {
            {3,8,2},
            {15,1,9} //Se busca el numero mas grande
        };
        int acumulador = matriz[0][0];
        for (int filas = 0; filas < matriz.length; filas++){
            for (int columnas = 0; columnas < matriz[filas].length; columnas++){
                if (acumulador < matriz[filas][columnas]){
                    acumulador = matriz[filas][columnas];
                }
            }
        }
        System.out.println(acumulador);
    }
}
