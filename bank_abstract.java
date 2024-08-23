abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class bank_abstract {
    public static void main(String[] args) {
        System.out.println("BANK SYSTEM USING ABSTRACTION");
        SavingsAccount sa1 = new SavingsAccount(2000);
        sa1.deposit(500);
        sa1.withdraw(1000);
        System.out.println("Savings Account Balance: " + sa1.getBalance());

        SavingsAccount sa2 = new SavingsAccount(1500);
        sa2.withdraw(600);
        System.out.println("Savings Account Balance: " + sa2.getBalance());
        
        CurrentAccount ca1 = new CurrentAccount(1000);
        ca1.deposit(300);
        ca1.withdraw(1500);
        System.out.println("Current Account Balance: " + ca1.getBalance());

        CurrentAccount ca2 = new CurrentAccount(200);
        ca2.withdraw(800);
        System.out.println("Current Account Balance: " + ca2.getBalance()); 

        SavingsAccount sa3 = new SavingsAccount(500);
        sa3.deposit(600);
        sa3.withdraw(200);

        System.out.println("Savings Account Balance: " + sa3.getBalance());
    }
}
