import java.util.*;
public class DivTry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter the numerator: ");
            int numerator = input.nextInt();

            System.out.println("Enter the denominator: ");
            int denominator = input.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + numerator + " / " + denominator + " = " + result);

        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Division by zero is not allowed!");
        } 
        finally 
        {
            input.close();
            System.out.println("Program ended.");
        }
    }
}
