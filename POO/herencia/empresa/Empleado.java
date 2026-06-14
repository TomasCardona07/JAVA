package herencia.empresa;

//======== CLASE PADRE ========
public class Empleado {
    String nombre;
    double salario;
    

    //=======CONSTRUCTOR=======
    Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    //======== ACCION =========
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}
