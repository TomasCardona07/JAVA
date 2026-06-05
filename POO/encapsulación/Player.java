package encapsulación;

public class Player {
    private String name;
    private int health;
    Player(String name,int health){
        this.name = name;
        this.health = health;
    }
    public int getHealth(){
        return health;
    }
    public void receiveDamage(int damage){
        health -= damage;
    }
    public static void main(String[] args) {
        Player player1 = new Player("Tomas", 100);
        player1.receiveDamage(30);
        System.out.println(player1.getHealth());
    }
}
