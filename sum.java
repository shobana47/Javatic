import java.util.Scanner;
public class sum
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter a positive integer:");
int n=input.nextInt();
int Sumnum=0;
for(int i=0;i<=n;i++)
{
Sumnum=n*(n+1)/2;
}
System.out.println("Sum of first "+ n +" natural number: "+Sumnum);
}
}
