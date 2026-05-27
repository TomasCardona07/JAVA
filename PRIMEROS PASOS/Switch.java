import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        System.out.println("Ingresa un numero del 1-4");
        int num = entradas.nextInt();
        switch(num){
            case 1:
                System.out.println("Elegiste un perro");
                break;
            case 2:
                System.out.println("Elegiste un gato");
                break;
            case 3:
                System.out.println("Elegiste un loro");
                break;
            case 4:
                System.out.println("Elegiste un pez");
                break;
            default:
                System.out.println("ningun animal");
        }
        entradas.close();
    }
}
