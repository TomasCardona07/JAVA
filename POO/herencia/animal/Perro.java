package herencia.animal;

public class Perro extends Animal {
    Perro(String nombre){
        super(nombre);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(nombre +" hace guau guau");
    }
}
