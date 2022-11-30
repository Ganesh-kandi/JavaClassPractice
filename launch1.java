package secondproject;

import java.util.Scanner;

class InvalidDetailsException extends Exception{
	public InvalidDetailsException(String str) {
		super(str);
	}
}
class ATM{
	private int password=2222;
	private int accountNo=1111;
	private int pass;
	private int accNo;
	public void inputUser() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the account number!");
		accNo=scanner.nextInt();
		System.out.println("Enter the password..");
		pass=scanner.nextInt();
	}
	public void verify() throws InvalidDetailsException
	{
		if(accountNo== accNo && password==pass) {
			System.out.println("welcome to bank ATM please collect the amount");
		}
		else {
			throw new InvalidDetailsException("we have entered incorrect details!!! ");
			}
	}
}
 class Bank{
	 public void initiate() {
		 ATM atm=new ATM();
		 try {
			 atm.inputUser();
			 atm.verify();
		 }catch(InvalidDetailsException e) {
			 System.out.println(e.getMessage());
			 try {
				 atm.inputUser();
				 atm.verify();
			 }catch(InvalidDetailsException r) {
				 System.out.println(r.getMessage());
				 System.out.println("your account gets blocked please check with your bank manager....");
				 System.exit(0);
			 }
		 }
	 }
 }
public class launch1 {

	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.initiate();

	}

}
