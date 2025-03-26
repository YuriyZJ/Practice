package Level2.Chapter1.Task4;

public class MathUtils {

    private MathUtils(){}

    public static int factorial(int a){
        if (a < 0) throw new IllegalArgumentException("Число должно быть неотрицательным");
        int result = 1;
        for (int i = 1; i <= a; i++){
            result *= i;
        }
        return result;
    }

    public static boolean isPrime(int n){
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
