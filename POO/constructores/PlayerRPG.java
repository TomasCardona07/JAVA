package constructores;

public class PlayerRPG {
    //Attributes:
    String name;
    int health;

    //Constructor:
    PlayerRPG(String name, int health){ 
        this.name = name;
        this.health = health;
    }
    void showState(){
        System.out.println("The player is: " + name);
        System.out.println("The player has " + health+" HP");
    }
    void receiveDamage(){
        health -= 10;
    }
    public static void main(String[] args) {
        PlayerRPG player1 = new PlayerRPG("Tomas", 100);
        player1.receiveDamage();
        player1.showState();
    }
}
