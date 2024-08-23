class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class bank{
    public static void main(String[] args) {
System.out.println(" ");
        System.out.println("\t\t BANK MANAGEMENT SYSTEM");
        System.out.println("\t\t__________________________");
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(500.0);
        System.out.println("Balance after Deposit: " + account.getBalance());
    }
}
