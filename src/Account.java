public class Account {
    private String userName;
    private double balance = 1000;

    public Account(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance is $" + balance + ".");
    }

    public void Withdraw(double amount) {

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance is $" + balance + ".");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
