package constructores.sobrecarga;

public class GameAccount {
    public String name;
    public int level;

    GameAccount(String name){
        this.name = name;
        this.level = 1;
    }
    GameAccount(String name, int level){
        this.name = name;
        this.level = level;
    }
    public void showProfile(){
        System.out.println("Username: " + name);
        System.out.println("Level: " + level);
    }
    public static void main(String[] args) {
        GameAccount player1 = new GameAccount("Tomas");
        GameAccount player2 = new GameAccount("Carlos", 25);
        player1.showProfile();
        player2.showProfile();
    }
}
