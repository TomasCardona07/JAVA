package encapsulación;

public class Player {
    //Clases privadas
    private String name;
    private int health;
    //Constructor
    Player(String name,int health){
        this.name = name;
        this.health = health;
    }
    //uso de getter para extraer health
    public int getHealth(){
        return health;
    }
    //uso de getter para extraer name
    public String getName(){
        return name;
    }
    //metodo para recibir la vida y calcular el daño
    public void receiveDamage(int damage){
        health -= damage;
    }
    //Main
    public static void main(String[] args) {
        Player player1 = new Player("Tomas", 100);
        player1.receiveDamage(30);
        System.out.print(player1.getName()+" has "); //se imprime el getName
        System.out.println(player1.getHealth() + " HP"); //Se imprime el metodo del player1
    }
}
