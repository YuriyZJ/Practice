package Level1.Task6;

public class Main {
    public static void main(String[] args) throws InsufficientFundsException {
        try{
        BankAccount bankAccount = new BankAccount(1, 1000.5);

        bankAccount.deposit(500);
        System.out.println();

            bankAccount.withdraw(2000);
        }
        catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}
