import java.util.Scanner; //Importar Scanner para inputs del usuario

public class EncontrarNum {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        int[] numeros = {5,8,12,20,30}; //Array incializado
        System.out.println("Ingresa y numero y te digo si se encuntra en la lista");
        int num = entradas.nextInt();
        boolean encontrado = false; //Declaracion del booleano
        for (int i = 0; i < numeros.length; i++){
            if (num == numeros[i]){
                encontrado = true;
                break; // si se encuntra entonces sale del bucle
            }
        }
        if (encontrado == false){
            System.out.println("Numero no encontrado");
        }
        else{
            System.out.println("Numero encontrado");
        }
        entradas.close();
    }
}
