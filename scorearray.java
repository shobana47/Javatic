import java.util.*;
public class scorearray
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the range:");
int n=input.nextInt();
System.out.println("Enter the scores:");
int scores[]=new int[n];

for(int i=0;i<n;i++)
{
scores[i]=input.nextInt();
}

System.out.print("Scores:");
for (int i = 0; i <= n-1; i++)
{
System.out.print(scores[i] + " ");
}

int sum=0;
for (int i = 0; i < n; i++)
{
sum += scores[i];
}
System.out.println("\nAverage Score: " + (float) sum / n);
int max = 0;
for (int i = 0; i < 5; i++)
{
if (scores[i] > max)
{
max = scores[i];
}
}
System.out.println("Highest Score: " + max);
int min = max;
for (int i = 0; i < 5; i++)
{
if (scores[i] < min)
{
min = scores[i];
}
}
System.out.println("Lowest Score: " + min);
}
}