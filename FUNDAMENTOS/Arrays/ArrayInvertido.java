package Arrays;
public class ArrayInvertido {
    public static void main(String[] args){
        int[] numeros = {1,2,3,4,5};
        for (int i = numeros.length -1; i >= 0; i--){ // inicia en numeros.lenglet -1 o sino el "I" valdria 5, el Array solo tiene 4
            System.out.println(numeros[i]);
        }
    }

}
