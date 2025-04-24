package Level1.Task4;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1,1000);

        bankAccount.deposit(100);
        bankAccount.deposit(501);


        try {
            bankAccount.withdraw(5000);
        } catch (IllegalArgumentException e) {
            System.err.println("Mistakes in withdraw exception" + e.getMessage());
        }

        //System.out.println(bankAccount.getBalance());
    }
}
