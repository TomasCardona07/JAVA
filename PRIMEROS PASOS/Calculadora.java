import java.util.Scanner;
public class Calculadora{
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in); 
        System.out.println("ingrese que operacion desea realizar");
        System.out.println("[1] = Suma");
        System.out.println("[2] = Resta");
        System.out.println("[3] = Multiplicación");
        System.out.println("[4] = Division");
        var operacion = entradas.nextLine();
        while (!operacion.equals("1") && !operacion.equals("2") && !operacion.equals("3") && !operacion.equals("4")){
            System.out.println("Numero no válido, Ingreselo nuevamente");
            operacion = entradas.nextLine();
        }
        if (operacion.equals("1")){
            var resultado = suma(entradas);
            System.out.println("El resultado de la suma es: "+resultado);
        }
        else if (operacion.equals("2")){
            var resultado = resta(entradas);
            System.out.println("el resultado de la resta es: "+resultado);
        }
        else if (operacion.equals("3")){
            var resultado = multiplicacion(entradas);
            System.out.println("el resultado de la multiplicación es: "+resultado);
        }
        else{
            var resultado = division(entradas);
            System.out.println("el resultado de la división es: "+resultado); 
        }
        entradas.close();
    }

    //Funcion suma:
    static double suma(Scanner entradas){ //Se ingresa el Scanner en cada funcion
        System.out.println("Ingrese el primer numero para realizar la suma");
        double num1 = entradas.nextDouble();
        System.out.println("Ingrese el segundo numero para realizar la suma");
        double num2 = entradas.nextDouble();
        return(num1 + num2);
    }
    //Funcion resta:
    static double resta(Scanner entradas){ //Se ingresa el Scanner en cada funcion
        System.out.println("Ingrese el primer numero para realizar la resta");
        double num1 = entradas.nextDouble();
        System.out.println("Ingrese el segundo numero para realizar la resta");
        double num2 = entradas.nextDouble();
        return(num1 - num2);
    }
    //Funcion multiplicación:
    static double multiplicacion(Scanner entradas){ //Se ingresa el Scanner en cada funcion
        System.out.println("Ingrese el primer numero para realizar la multiplicación");
        double num1 = entradas.nextDouble();
        System.out.println("Ingrese el segundo numero para realizar la multiplicación");
        double num2 = entradas.nextDouble();
        return(num1 * num2);
    }
    //Funcion división:
    static double division(Scanner entradas){ //Se ingresa el Scanner en cada funcion
        System.out.println("Ingrese el primer numero para realizar la división");
        double num1 = entradas.nextDouble();
        System.out.println("Ingrese el segundo numero para realizar la división");
        double num2 = entradas.nextDouble();
        while (num2 == 0){     //Validacion porque no se puede dividir por 0
            System.out.println("no se puede dividir por 0");
            System.out.println("Ingresa el segundo numero nuevamente");
            num2 = entradas.nextDouble();
        }
        return(num1 / num2);
    }
}

