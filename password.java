import java.util.Scanner;

public class password{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		String pwd = "something2005";

		while (true){
			System.out.print("Enter password: ");
			String prompt = input.next();
			if (pwd.equals(prompt)){
				System.out.println("Correct!");
				break;
			}
			else{
				System.out.println("Incorrect! Try again!");
			}
		}
	}
}