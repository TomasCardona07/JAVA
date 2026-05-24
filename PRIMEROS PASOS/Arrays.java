import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        /*Declaracion de Arrays con 3 numeros de ejemplos
        int[] numeros = {10,20,30};
        System.out.println(numeros[1]); //Imprime el numero 20*/

        //usar For para recorrer el Array
        /*int[] numeros = {5,10,15,20,25};
        for (var i = 0; i <numeros.length; i++){ //.lenglet es el tamaño del array.(5) en este caso
            System.out.println(numeros[i]);
        }*/
       //Ejercicio de pedir datos y almacenar en el array, luego imprimirlos con otro FOR
       Scanner entradas = new Scanner(System.in);
       int[] numeros = new int [5];
       for (int i = 0; i < numeros.length; i++){
        System.out.println("ingrese un numero al Array");
        numeros[i] = entradas.nextInt();
       }
       for (int i = 0; i < numeros.length; i++){
        System.out.println(numeros[i]);
       }
       entradas.close();
    }
}
