public class NumeroMayor {
    public static void main(String[] args) {
        int[] numeros = {4,7,2,15,9}; //Creacion de array
        int numMayor = numeros[0]; // se declara y se incia la variable numMayor
        for (int i = 1; i < numeros.length; i++){ // se incia en 1 porque el numMayor ya guarda el 0
            if (numeros[i] > numMayor){
                numMayor = numeros[i]; //Se actualiza si el numero de la lista es mayor que el que ya estaba
            }
        }
        System.out.println("El numero mayor es: "+ numMayor); //Se muestra el numero mayor
    }
}
