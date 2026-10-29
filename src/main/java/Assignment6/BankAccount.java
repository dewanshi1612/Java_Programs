package Assignment6;

public class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        account.deposit(1500);

        System.out.println("Current Balance: " + account.getBalance());
    }

}
