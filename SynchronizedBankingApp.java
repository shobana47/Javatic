import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized deposit method
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: $" + amount);
            System.out.println("New balance: $" + balance);
        }
    }

    // Synchronized withdraw method
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw $" + amount + " - Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class BankingThread extends Thread {
    private BankAccount account;
    private boolean isDeposit;
    private double amount;

    public BankingThread(BankAccount account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class SynchronizedBankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance for the account: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();

        // Creating threads for deposit and withdrawal
        BankingThread depositThread = new BankingThread(account, true, depositAmount);
        BankingThread withdrawThread = new BankingThread(account, false, withdrawAmount);

        // Naming threads for better output readability
        depositThread.setName("DepositThread");
        withdrawThread.setName("WithdrawThread");

        // Starting both threads
        depositThread.start();
        withdrawThread.start();

        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Final account balance: $" + account.getBalance());

        scanner.close();
    }
}
