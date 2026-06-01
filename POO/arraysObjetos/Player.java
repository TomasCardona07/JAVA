package arraysObjetos;
//Academia de videojuegos registra 4 personas, al final se muestra los nombres de los registrados
public class Player {
    String name;
    int level;
    Player(String name, int level){
        this.name = name;
        this.level = level;
    }
    public static void main(String[] args) {
        Player player1 = new Player("Tomas", 12);
        Player player2 = new Player("Carlos", 2);
        Player player3 = new Player("Juan", 20);
        Player player4 = new Player("Andrea", 7);
        Player players[] = {player1,player2,player3,player4};
        for (int i = 0; i < players.length; i++){
            System.out.println(players[i].name);
        }
    }
}
