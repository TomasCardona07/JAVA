import java.util.Scanner;

public class Terreno{
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double ancho, precio, largo;
        System.out.println("Ingrese el ancho del alambre en metros");
        ancho = Double.parseDouble(src.nextLine());
        System.out.println("Ingrese el largo del alambre en metros");
        largo = Double.parseDouble(src.nextLine());
        System.out.println("Ingrese el precio del metro cuadrado de tierra");
        precio = Double.parseDouble(src.nextLine());
        double perimetro = ((ancho * 2)+(largo * 2));
        double area = ancho * largo;
        double precioTerreno = area * precio;
        System.out.println("El precio del terreno es: " + precioTerreno);
        System.out.println("la cantidad de metros que se neceistan para cercar 3 veces es: " + (perimetro * 3) + "metros");
        src.close();
    }
}