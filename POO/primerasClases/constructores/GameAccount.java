package constructores;

public class GameAccount {
    String username;
    int level;
    GameAccount(String name, int level){
        this.username = name;
        this.level = level;
    }
    void showProfile(){
        System.out.println("username: " + username);
        System.out.println("Level: " + level);
    }
    void levelUp(){
        level += 1;
    }
    public static void main(String[] args) {
        GameAccount player1 = new GameAccount("Cardona07", 17);
        player1.levelUp();
        player1.showProfile();
    }
}
