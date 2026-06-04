package arraysObjetos;

public class Pet {
    String name;
    int age;
    Pet(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Pet pet1 = new Pet("Toby", 12);
        Pet pet2 = new Pet("Crenola", 10);
        Pet pet3 = new Pet("perrosqui", 4);
        Pet pet4 = new Pet("terro", 16);
        Pet pet5 = new Pet("tree", 3);
        Pet pets[] = {pet1,pet2,pet3,pet4,pet5};
        int petOlderAge = pets[0].age;
        int petYoungerAge = pets[0].age;
        String petYoungerName = pets[0].name;
        String petOldererName = pets[0].name;
        for (int i = 1; i < pets.length; i++){
            if (pets[i].age > petOlderAge) {
                petOlderAge = pets[i].age;
                petOldererName = pets[i].name;
            }
            if (pets[i].age < petYoungerAge) {
                petYoungerAge = pets[i].age;
                petYoungerName = pets[i].name;
            }
        }
        System.out.println("There are " +  pets.length + " pets");
        System.out.println("The older is " + petOldererName + ", it is " + petOlderAge);
        System.out.println("The younger is " + petYoungerName + ", it is " + petYoungerAge);
    }
}
