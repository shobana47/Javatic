import java.util.Scanner;
public class bmi
{
public static void main(String[] args)
{
System.out.println("Calculaes BMI");
Scanner input=new Scanner(System.in);

System.out.println("Enteryour weight:");
double weight=input.nextDouble();

System.out.println("Enter your height:");
double height=input.nextDouble();

double BMI=weight/(height*height);
System.out.println("BMI:"+BMI);

if (BMI<18.5)
{
System.out.println("Underweight");
}
else if (BMI>=18.5&&BMI<24.9)
{
System.out.println("Normalweight");
}
else if (25.5<=BMI&&BMI<29.9)
{
System.out.println("Overweight");
}
else
{
System.out.println("Obesity");
}
}
}








