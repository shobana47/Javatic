import java.util.Scanner;

public class FirstDivisibleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int n = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int d = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % d == 0) {
                System.out.println("The first divisible number is " + i);
                break;
                   }
        }

     }
}
