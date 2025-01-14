//
package Account_Pack;

   public class BankAccount {
     String accountHolderName;
     int accountNumber;
     double balance;

   public BankAccount(String name, int number, double initialBalance) {
        accountHolderName = name;
        accountNumber = number;
        balance = initialBalance;
    }

    public void showAccountInfo() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
  public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("RISHIKANTA PANDA",979650678,180000.00);
        
        // Show account information
        account.showAccountInfo();
    }
   }
