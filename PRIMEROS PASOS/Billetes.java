import java.util.Scanner;

public class Billetes {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double B100,B50,B20,B10,B5,B2,B1;
        System.out.println("Ingrese el monto en dólares");
        int monto = Integer.parseInt(src.nextLine());
        B100 = ((int)(monto/100)); // "(int)" lo trunca y se queda con la parte entera
        monto %= 100; // "%" Se queda con la parte restante
        System.out.println("Se necesita " + B100 + " Billetes de 100 Dolares");
        B50 = ((int)(monto / 50));
        monto %= 50;
        System.out.println("Se necesita " + B50 + " Billetes de 50 Dolares");
        B20 = ((int)(monto / 20));
        monto %= 20;
        System.out.println("Se necesita " + B20 + " Billetes de 20 Dolares");
        B10 = ((int)(monto / 10));
        monto %= 10;
        System.out.println("Se necesita " + B10 + " Billetes de 10 Dolares");  
        B5 = ((int)(monto / 5));
        monto %= 5;
        System.out.println("Se necesita " + B5 + " Billetes de 5 Dolares");
        B2 = ((int)(monto / 2));
        monto %= 2;
        System.out.println("Se necesita " + B2 + " Billetes de 2 Dolares");
        B1 = ((int)(monto / 1));
        monto %= 1;
        System.out.println("Se necesita " + B1 + " Billetes de 1 Dolares");    
        src.close();  
        
    }
}
