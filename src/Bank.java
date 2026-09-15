public class Bank {
    private String name;
    private double balance;

    public Bank(String name, double balance) {
        this.name = name;
        if (balance >= 0.00) {
            this.balance = balance;
        }
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount > 0.00 && withdrawalAmount <= balance) {
            balance -= withdrawalAmount;

        }

    }
    public void transfer(double transferAmount) {
        if (transferAmount > 0.00 && transferAmount <= balance) {
            balance -= transferAmount;

        }
    }

}
