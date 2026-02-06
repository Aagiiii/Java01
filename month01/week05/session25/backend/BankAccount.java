
public class BankAccount {
    // TODO: private fields
    private String accountNumber;
    private String ownerName;
    private double balance;

    // TODO: Constructor 1 (accountNumber, ownerName)
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    // TODO: Constructor 2 (accountNumber, ownerName, initialBalance)

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // TODO: Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    // TODO: deposit(double amount)
    // public double
    public void deposit(double amount) {
        balance = balance + amount;

        System.out.println(amount + "$ " + "is deposited.");
    }

    // TODO: withdraw(double amount) - boolean буцаах
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
           System.out.println(amount + "$" + " is withdrawed.");
            return true;

        } else {
            // balance =balance;
            System.out.println("Insuficient balance." + "Your balance is :" + balance);
            return false;

        }}

    public boolean transfer( BankAccount target, double amount){
        if (accountNumber.equals(target.getAccountNumber())) {
            System.out.println("Same account");
            return false;
        }
        if (amount > balance) {
         System.out.println("Insufficient");
            return false;
       }
       System.out.println("transfer successful");
            balance = balance-amount;
            target.deposit(amount);
            
            return true;
       
           
   
    }
    

    // TODO: displayInfo()
    public void displayInfo() {
        
        System.out.println(this.getAccountNumber() + " : " + getOwnerName() + " - " + getBalance() + "$");

        
    }
}
