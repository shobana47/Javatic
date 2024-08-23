import java.util.Scanner;
import java.util.Random;

public class guess 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
Random rand = new Random();

int num = rand.nextInt(1, 101);
System.out.println("Welcome to the Guessing Game!\nI have selected a number between 1 to 100!\nCan you guess what it is?\n");
        
int prompt;
do 
{
System.out.print("Enter your guess: ");
prompt = input.nextInt();
if (prompt == num) 
{
System.out.println("Congratulations! You guessed the number!");
} 
else if (prompt > num) 
{
System.out.println("Too High!");
} 
else 
{
System.out.println("Too Low!");
}
} while (prompt != num);
}
}
