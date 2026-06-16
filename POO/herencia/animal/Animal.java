package herencia.animal;
// ======= CLASE PADRE =========
public class Animal {
    String nombre;
    Animal(String nombre){
        this.nombre = nombre;
    }

    // ===== ACCION DEL ANIMAL ========
    public void hacerSonido(){
        System.out.println(nombre + " hace sonido ");
    }
}
