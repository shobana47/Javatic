import java.util.Scanner;

public class bank{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Current Balance: ");
		float cur_bal = input.nextFloat();
		System.out.print("Withdrawal Amount: ");
		float withdraw_amt = input.nextFloat();
		
		if (withdraw_amt > cur_bal){
			System.out.println("Insufficient Balance!");
		}
		else{
			cur_bal = cur_bal - withdraw_amt;
			System.out.println("Withdraw successful. New balance: " + cur_bal);
		}
	}
}