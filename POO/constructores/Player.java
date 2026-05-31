package constructores;

public class Player {
    String name;
    int health;
    Player(String name, int health){
        this.name = name;
        this.health = health;
    }
    void receiveDamage(int damage){
        health -= damage;
    }
    void heal(int amount){
        health += amount;
    }
    void showStatus(){
        System.out.println("Player: " + name);
        System.out.println("Health: " + health);
    }
    public static void main(String[] args) {
        Player player1 = new Player("Tomas", 100);
        player1.receiveDamage(30);
        player1.heal(15);
        player1.showStatus();
    }
}
