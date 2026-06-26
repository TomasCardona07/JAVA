package Metodos;
//Es como modular el codigo en el mismo archivo (Clase)
public class Funciones {
    //Función
    /*static void saludar(){
        System.out.println("Hola");
    }
    //CODIGO PRINCIPAL (main)
    public static void main(String[] Funcion) {
        saludar();
    }*/


   /* Funcion con parametros:
   static void mostrarEdad(int edad){
    System.out.println("Tu edad es: "+edad);
   }
    //main:
   public static void main(String[] FunParametros) {
    mostrarEdad(20);
   }*/


    static int multiplicar(int num1, int num2){
        return num1 * num2;

    }
    public static void main(String[] Multiplicar) {
        var resultado = multiplicar(12, 43);
        System.out.println("El resultado es: "+resultado);
        
    }
}
