package constructores;

public class Pet {
    String name;
    int energy;
    Pet(String name, int energy){
        this.name = name;
        this.energy = energy;
    }
    void play(){
        energy -= 20;
    }
    void rest(){
        energy += 10;
    }
    void showStatus(){
        System.out.println("Pet: " + name);
        System.out.println("Energy: " + energy);
    }
    public static void main(String[] args) {
        Pet dog = new Pet("Tobi", 100);
        dog.play();
        dog.play();
        dog.rest();
        dog.showStatus();
    }
}
