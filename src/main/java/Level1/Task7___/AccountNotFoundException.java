package Level1.Task7___;

public class AccountNotFoundException extends Exception{
    public AccountNotFoundException(int accountId){
        super("Account with id " + accountId + " not found");
    }
}
