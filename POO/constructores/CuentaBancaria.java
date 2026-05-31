package constructores;

public class CuentaBancaria {
    String nombre;
    double saldo;
    CuentaBancaria(String nombre, double saldo){ //Constructor
        this.nombre = nombre;
        this.saldo = saldo;
    }
    void mostrarCuenta(){
        System.out.println("El titular es: "+nombre);
        System.out.println("El saldo es: "+saldo);
    }
    public static void main(String[] args) {
        CuentaBancaria cuentaJefe = new CuentaBancaria("Tomas", 50000); // se asignan valores de una vez
        cuentaJefe.mostrarCuenta();
    }
}
