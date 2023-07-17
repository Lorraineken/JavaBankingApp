
public class Main {
    public static void main(String[] args) {
      // Bank Account Instance
        BankAccount myAccount = new BankAccount("Lorraine",2000);
        myAccount.withdraw(500);
        System.out.println(myAccount.getBalance());
    }
}