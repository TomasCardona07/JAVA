package herencia.animal;

public class Animal {
    String nombre;
    Animal(String nombre){
        this.nombre = nombre;
    }
    public void hacerSonido(){
        System.out.println(nombre + " hace sonido ");
    }
}
