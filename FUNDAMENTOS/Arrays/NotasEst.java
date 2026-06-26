package Arrays;
import java.util.Scanner;
public class NotasEst {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        double[] notas = new double[5];
        for (int i = 0; i < notas.length; i++){
            System.out.println("ingrese la "+(i + 1)+ " nota del estudiante");
            notas[i] = entradas.nextDouble();
            while (notas[i] < 0){
                System.out.println("La nota no puede ser negativa, ingresela nuevamente");
                notas[i] = entradas.nextDouble();         
            }
        }
        double acumulador = 0;
        for (int i = 0; i < notas.length; i++){
            acumulador = acumulador + notas[i];
        }
        double promedio = (acumulador / notas.length);
        System.out.println("su promedio es: " + promedio);
        if (promedio >= 3){
            System.out.println("Aprobó la materia");
        }
        else{
            System.out.println("Perdió la materia");
        }
        entradas.close();
    }
}
