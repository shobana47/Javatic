import java.util.Scanner;
import java.util.Random;
public class multiplicationgame
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
Random random=new Random();
while(true)
{
int a=random.nextInt(1,11);
int b=random.nextInt(1,11);
int result=a*b;
System.out.println("What is " + a + " * " + b + " ?");
System.out.print("Enter your answer (or 0 to exit): ");
int prompt=input.nextInt();
if(prompt==result)
{
System.out.println("Correct!");
}
else if (prompt==0)
{
System.out.println("Thank you for practicing multiplication!");
break;
}
else
{
System.out.println("Incorrect! The correct answer is: " + result);
}
}
}
}