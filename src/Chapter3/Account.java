package Chapter3;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if (balance > 5000) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            this.balance = this.balance + depositAmount;
        }
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            this.balance = this.balance;
        } else {
            System.out.println("Withdrawal amount exceeded account balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
