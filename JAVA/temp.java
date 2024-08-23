import java.util.Scanner;
public class temp
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);

System.out.print("Enter the temperature in Fahrenheit:");
double Fahrenheit=input.nextFloat();

double Celsius= (Fahrenheit-32)*5/9;

System.out.println("After Convertion Of FAHRENHEIT TO CELSIUS:");
System.out.println("FAHERNHEIT:"+Fahrenheit);
System.out.println("CELSIUS:"+Celsius);
}
}




