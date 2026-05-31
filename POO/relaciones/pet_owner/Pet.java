package relaciones.pet_owner;

public class Pet {
    String name;
    int age;
    Owner owner;
    Pet(String name, int age, Owner owner){
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
    void showInfo(){
        System.out.println("Pet: " + name);
        System.out.println("Pet's age: " + age);
        System.out.println("Owner: " + owner.name);
        System.out.println("Owner's phone: " + owner.phone);
    }
    public static void main(String[] args) {
        Owner owner1 = new Owner("Carlos", "33838747");
        Pet cat = new Pet("Tom", 8, owner1);
        cat.showInfo();
    }
}
