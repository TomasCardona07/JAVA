package herencia.Zoológico;

public class Gato extends Animal {
    Gato(String nombre){
        super(nombre);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println( nombre + " hace miau miau");
    }
}
