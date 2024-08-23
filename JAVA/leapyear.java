import java.io.*;
import java.util.Scanner;
public class leapyear
{
     public static void main(String[] args)
    {
        int year;
 
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
 
         if ((year % 400 == 0)|| ((year % 4 == 0) && (year % 100 != 0))) 
{
            System.out.println(year + " : Leap Year");
        }
 
        else
 {
      
            System.out.println(year + " : Non - Leap Year");
        }
    }
}