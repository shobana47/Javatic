import java.util.Scanner;
public class evenskip
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("Enter a positive integer:");
int n=input.nextInt();
System.out.print("Odd numbers from 1 to 10:\n");
int i;
for(i=1;i<=n;i++)
{
if(i%2==0)
{
continue;
}
System.out.print(i+" ");
}
}
}