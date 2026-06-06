package encapsulación;

public class BankcAccount {
    //Atributos
    private String owner;
    private int balance;

    //Constructor
    BankcAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }
    //Getter de balance
    public int getBalance(){
        return balance;
    }
    //el deposito no puede ser negativo
    public void deposit(int amount){
        if (amount < 0) {
            System.out.println("the amount cannot be negative");
        }
        else{
            balance += amount;
            System.out.println(owner +" deposited " + amount);
            System.out.println("The balance now is: " + balance);
        }
    }
    public static void main(String[] args) {
        BankcAccount person1 = new BankcAccount("Tomas", 1000);
        System.out.println("The balance is " + person1.getBalance());
        person1.deposit(1000);
    }
}
