package Week_2.Threads.Exercise_4;


public class Transaction extends Thread {
    private BankAccount account;
    private boolean deposit;
    private int amount;

    public Transaction(BankAccount account, boolean deposit, int amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (deposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

