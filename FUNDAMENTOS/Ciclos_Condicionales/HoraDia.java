package Ciclos_Condicionales;
import java.util.Scanner; //Importar Scanner

public class HoraDia {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese La hora del dia entre 0-23");
        int hora = Integer.parseInt(src.nextLine());
        while ((hora < 0) || (hora > 23)) {
            System.out.println("Hora incorrecta, ingresela nuevamente");
            hora = Integer.parseInt(src.nextLine());
        }
        if ((hora >= 0) && (hora <= 5)) {
            System.out.println("momento del dia: madrugada");
        }
        else if ((hora > 5) && (hora <= 11)) {
            System.out.println("momento del dia: mañana");
        }
        else if ((hora > 11) && (hora <= 13)) {
            System.out.println("momento del dia: medio dia");
        }
        else if ((hora > 13) && (hora <= 19)) {
            System.out.println("momento del dia: tarde");
        }
        else{
            System.out.println("Momento del dia: noche");
        }
        src.close();
    }
}
