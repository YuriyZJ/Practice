package Level2.Chapter5.Task1_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticOperations {
    Scanner number = new Scanner(System.in);
    private int x;
    private int y;
    private int a;

    public void request(){
        System.out.print("Enter a number one: ");
        x = number.nextInt();
        System.out.print("Enter a number two: ");
        y = number.nextInt();
    }

    public void mathDivide(){
        try {
            int result = x/y;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error. You can't divide by 0.");
        } finally {
            System.out.println("Operation finished.");
        }
    }

    public void mathSquare() {
        try {
            System.out.println("Enter a number: ");
            a = number.nextInt();
            double result = Math.pow(a, 2);
            System.out.println("Result = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error. Input is correct a number");
        } finally {
            System.out.println("Operation finished.");
        }
    }
}
