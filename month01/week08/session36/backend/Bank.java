abstract class BankAccount{
    protected int accountNumber; String owner; double balance;

    public BankAccount(int accountNumber, String owner, double balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public abstract double calculateInterest();
    public abstract String getAccountType();

    public double deposit(double amount){
       
        return balance += amount;
    }

    public void  withdraw(double amount){
       balance=balance -amount;
       System.out.println("balance" + balance);
    }

    public void printStatement(){
        System.out.printf("%d , %s of the balance : %.2f, -  %.2f%n", accountNumber, owner, balance, calculateInterest());
    }
}


class SavingsAccount extends BankAccount{
    private static final double  min_balance = 1000;
    private double interestRate;
    public SavingsAccount (int accountNumber, String owner, double balance, double interestRate){
        super(accountNumber, owner, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        // TODO Auto-generated method stub
        return balance *interestRate;
    }

   @Override
   public String getAccountType() {
       return "Savings";
   }

   public void withdraw(double amount) {
    if (balance- amount < min_balance) {
        throw new IllegalStateException("Cannot withdraw: balance would fall below min " + min_balance + "$");
    } else{
        balance -=amount;
    }
    // super.withdraw(amount);
   }
}


public class Bank {
    public static void main(String[] args) {
        
    }
}
