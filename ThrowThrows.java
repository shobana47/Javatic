import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class ThrowThrows{

    public static void checkNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed: " + number);
        } else {
            System.out.println("The number is positive: " + number);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            checkNumber(number);

        } catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            input.close();
            System.out.println("Program finished.");
        }
    }
}
