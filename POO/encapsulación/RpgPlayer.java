package encapsulación;

public class RpgPlayer {
    //Atributos:
    private String name;
    private int health;
    RpgPlayer(String name, int health){
        this.name = name;
        this.health = health;
    }

    //Obtener vida de la clase privada
    public int getHealth(){
        return health;
    }

    //Obtener nombre de la clase privada
    public String getName(){
        return name;
    }

    //Recibe daño y la vida no puede ser menor a 0
    public void receiveDamage(int damage){
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    //Recibe vida pero no puede ser mayor a 100
    public void heal(int heal){
        health += heal;
        if (health > 100) {
            health = 100;
        }
    }
    public static void main(String[] args) {
        RpgPlayer player1 = new RpgPlayer("Tom", 100);
        player1.receiveDamage(30);
        System.out.println(player1.getName() +" has received damage");
        System.out.println(player1.getName() +" has " + player1.getHealth() + " Hp");
        player1.heal(40);
        System.out.println(player1.getName() +" has been cured");
        System.out.println(player1.getName() + " has " + player1.getHealth() + " HP");
    }
}
