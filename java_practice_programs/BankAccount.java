class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void display() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1234, "John", 5000);
        sa.display();
        sa.deposit(2000);
        System.out.println("Balance: " + sa.getBalance());
    }
}
