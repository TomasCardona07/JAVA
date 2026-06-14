package herencia.empresa;

// ========== CLASE HIJA DE EMPLEADO ===============
public class Programador extends Empleado {

    String lengFav; // NUEVO ATRIBUTO


    Programador(String nombre, double salario, String lengFav){
        super(nombre,salario); //ATRIBUTOS HEREDADOS
        this.lengFav = lengFav;
    }

    
    // ========= NUEVA ACCION ===========
    public void infoProgramador(){
        mostrarInfo(); // ACCION DE CLASE PADRE
        System.out.println("SOLO " + lengFav);
    }
}
