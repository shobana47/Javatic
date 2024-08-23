import java.util.Scanner;
public class pass
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("enter you mark:");
int passmark=input.nextInt();
String passorfail=(passmark>=50)?"Pass":"Fail";
System.out.print(passorfail);
}
}