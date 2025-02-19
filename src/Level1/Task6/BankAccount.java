package Level1.Task6;

public class BankAccount {
    private double balance;
    private final int accountNumber;

    public BankAccount(int accountNumber, double balance){
        if (balance < 0){
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.balance += amount;
        System.out.println("Deposited " + amount + " to the account " + this.accountNumber + ". Balance: " + this.balance );
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (amount > this.balance){
            throw new InsufficientFundsException(amount, this.balance);
        }
        this.balance -= amount;
        System.out.println("Withdrawn " + amount + " from the account " + this.accountNumber + ". Balance: " + this.balance );
    }
}
