import java.util.Scanner;

class Calculator {
    // Method for addition
    double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }
}

public class calci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("\t\tSIMPLE CALCULATOR WITH MULTIPLE OPERATIONS ");
        System.out.println(" ");

        
        Calculator calculator = new Calculator();
        boolean continueCalculations = true;

        while (continueCalculations) {
            // Prompt user to input two numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Prompt user to select an arithmetic operation
            System.out.println("Select an operation: +, -, *, /");
            System.out.print("Enter your choice: ");
            char operation = scanner.next().charAt(0);

            double result = 0;
            boolean validOperation = true;

            // Perform the selected operation
            switch (operation) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    if (Double.isNaN(result)) {
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operation selected.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }

            // Ask the user if they want to perform another calculation
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String continueInput = scanner.next();
            continueCalculations = continueInput.equalsIgnoreCase("yes");
        }

        System.out.println("Calculator program terminated.");
        scanner.close();
    }
}
