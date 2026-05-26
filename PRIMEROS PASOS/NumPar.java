public class NumPar {
    public static void main(String[] args) {
        int[] numeros = {2,5,8,9,10,13,20,};
        int contador = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                contador++;
            }
        }  
        System.out.println("Hay "+ contador+" numeros pares");
    }
}
