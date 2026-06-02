package arraysObjetos;

public class Ranking {
    //Atributes
    String name;
    int power;
    int kill;
    int game;
    //Constructor
    Ranking(String name, int kill, int game){
        this.name = name;
        this.kill = kill;
        this.game = game;
    }
    int power(){
        return kill + game;
    }
    //Main
    public static void main(String[] args) {
        Ranking player1 = new Ranking("Tomas", 2309, 2891);
        Ranking player2 = new Ranking("Carlos", 1988, 2821);
        Ranking player3 = new Ranking("Sofia", 1331, 3420);
        Ranking player4 = new Ranking("Diego", 2001, 4000);
        Ranking players[] = {player1,player2,player3,player4};
        int mostPower = players[0].power;
        String mostPowerName = players[0].name;
        for (int i = 1; i < players.length; i++){
            if (players[i].power() > mostPower){
                mostPower = players[i].power();
                mostPowerName = players[i].name;
            }
        }
        System.out.print("Most power: " + mostPowerName + ",");
        System.out.println(" Power: " + mostPower);
    }
}
