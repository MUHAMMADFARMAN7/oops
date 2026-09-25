public class DigitalWallet {
    private double balance = 0.0;

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean spend(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public boolean canAfford(double amount) {
        return amount > 0 && amount <= balance;
    }
}