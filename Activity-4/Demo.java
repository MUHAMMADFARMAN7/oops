public class Demo {
    public static void main(String[] args) {
        DigitalWallet w1 = new DigitalWallet();
        DigitalWallet w2 = new DigitalWallet();

        System.out.println("--- Wallet 1 Operations ---");
        runOp(w1, "deposit(500)", w1.deposit(500));
        runOp(w1, "deposit(-10)", w1.deposit(-10));
        runOp(w1, "spend(200)", w1.spend(200));
        runOp(w1, "spend(1000)", w1.spend(1000));
        System.out.println("canAfford(301) -> Result: " + w1.canAfford(301) + " | Balance: " + w1.getBalance());
        runOp(w1, "spend(300)", w1.spend(300));

        System.out.println("\n--- Wallet 2 Independence Check ---");
        System.out.println("Wallet 2 Balance: " + w2.getBalance());

        // Experiment: Direct private field modification attempt (Commented out to allow compilation)
        // w1.balance = -500; // Error: balance has private access in DigitalWallet
    }

    private static void runOp(DigitalWallet w, String label, boolean result) {
        System.out.println(label + " -> Result: " + result + " | Balance: " + w.getBalance());
    }
}