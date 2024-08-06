package Week_2.Threads.Exercise_4;


public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Transaction t1 = new Transaction(account, true, 500);  
        Transaction t2 = new Transaction(account, false, 200); 
        Transaction t3 = new Transaction(account, true, 300);  
        Transaction t4 = new Transaction(account, false, 100); 

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}

