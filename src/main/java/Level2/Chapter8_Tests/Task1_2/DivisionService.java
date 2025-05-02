package Level2.Chapter8_Tests.Task1_2;

public class DivisionService {
    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divider can't be zero");
        return a / b;
    }
}
