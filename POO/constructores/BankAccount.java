package constructores;

public class BankAccount {
    String owner;
    double balance;
    BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }
    void deposit(double amount){
        balance += amount;
    }
    void showBalance(){
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Tom", 1000);
        account1.deposit(500);
        account1.showBalance();
    }
}
