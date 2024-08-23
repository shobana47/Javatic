public class swapnum
{
public static void main(String[] args)
{
int a=10;
int b=20;
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping two numbers:");
System.out.println("a="+a); 
System.out.println("b="+b);
}
}