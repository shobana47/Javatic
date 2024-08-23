import java.util.Scanner;
public class biodata
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.print("Enter your name:");
String name=input.nextLine();

System.out.print("enter your age:");
int age=input.nextInt();

System.out.print("Enter your gender(M/F):");
char gender=input.next().charAt(0);

System.out.print("Enter you height:");
double height=input.nextDouble();

System.out.println("are you married or not:?(true\false)");
boolean ismarried=input.nextBoolean();

System.out.println("\t\tBIO DATA\t\t");
System.out.println("NAME:"+name);
System.out.println("AGE:"+age);
System.out.println("GENDER:"+gender);
System.out.println("HEIGHT:"+height);
System.out.println("MARTIAL STATUS:"+ismarried);
}
} 


