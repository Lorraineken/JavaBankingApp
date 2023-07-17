public class BankAccount {
    private String owner;
    private double balance;

    // constructor
    BankAccount(String owner,double balance){
        this.owner = owner;
        this.balance = balance;
    }

    //Getters
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}
