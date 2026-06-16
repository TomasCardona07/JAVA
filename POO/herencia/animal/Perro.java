package herencia.animal;

// ======= CLASE HIJA =======
public class Perro extends Animal { //Hereda de animal
    Perro(String nombre){
        super(nombre);  // Constructor clase padre
    }

    // ========= MODIFICAR ACCION USANDO OVERRIDE ==========
    @Override
    public void hacerSonido(){
        System.out.println(nombre +" hace guau guau");
    }
}
