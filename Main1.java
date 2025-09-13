class BankAccount {
    static String bankName = "Global Bank";   // Static variable
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber;  // Final variable (cannot be changed)

    // Constructor using "this"
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method to display account details
    public void displayDetails() {
        if (this instanceof BankAccount) {  // instanceof check
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 101);
        BankAccount acc2 = new BankAccount("Bob", 102);

        acc1.displayDetails();
        acc2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
