class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Week9_Task01_BankingTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        account.deposit(500);
        account.withdraw(200);
        account.displayBalance();
    }
}