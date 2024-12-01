// Custom Exception class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class
 public class ExceptionFund {
    private double balance;

    // Constructor to initialize balance
    public ExceptionFund (double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Your balance is: $" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: $" + balance);
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! New balance: $" + balance);
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        ExceptionFund  account = new ExceptionFund (500.0); // Account initialized with $500

        try {
            account.deposit(200); // Deposit $200, balance becomes $700
            account.withdraw(100);  // Withdraw $100, balance becomes $600
            account.withdraw(800);  // Attempt to withdraw $800, exception will be thrown
        } catch (InsufficientFundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
