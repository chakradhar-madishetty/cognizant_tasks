package Week_2.Threads.Exercise_4;


public class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ", new balance: " + balance);
        }
    }

    public synchronized void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", new balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal");
        }
    }

    public int getBalance() {
        return balance;
    }
}

