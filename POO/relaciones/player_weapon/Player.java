package relaciones.player_weapon;

public class Player {
    String name;
    int health;
    Weapon weapon;
    Player(String name, int health, Weapon weapon){
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }
    void showStatus(){
        System.out.println("Player: " + name);
        System.out.println("Health: " + health);
        System.out.println("Weapon: " + weapon.name);
        System.out.println("Damage: " + weapon.damage);
    }
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 20);
        Player player1 = new Player("Tomas", 100, sword);
        player1.showStatus();
    }
}
