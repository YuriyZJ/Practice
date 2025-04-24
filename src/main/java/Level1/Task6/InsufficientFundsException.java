package Level1.Task6;

public class InsufficientFundsException  extends Exception{
    public InsufficientFundsException(double amount, double balance){
        super("Insufficient Funds. Balance :" + balance + ", запрошено: " + amount);
    }
}
