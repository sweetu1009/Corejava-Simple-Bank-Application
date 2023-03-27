package BankApplication;

import java.util.Scanner;

public class BankingApplication 
{
	
	Scanner sc=new Scanner(System.in);
	void BankAccount()
	{
		int balance=500000;
		while(true)
		{
			int withdraw ,deposit ,previousTransaction;
			System.out.println("************** SIMPLE BANK APPLICATION ****************");
			System.out.println();
			System.out.println("Select 1 for Withdraw");
			System.out.println("Select 2 for Deposit");
			System.out.println("Select 3 for Check Your Balance");
			System.out.println("Select 4 for Check your previousTransaction");
			System.out.println("Select 5 for Exit the System");
			System.out.println( );
			System.out.println("--------------------------------------------------------");
			System.out.println("Enter Your Option");
            System.out.println("--------------------------------------------------------");
			int ch=sc.nextInt();
			switch (ch)
			{
			case 1:
				System.out.println("Enter money to be withdrawn");
				withdraw=sc.nextInt();
				if(balance>=withdraw)
				{
					balance=balance-withdraw;
					System.out.println(withdraw+" is successfully withdraw from your account");
					
					System.out.println("Your account balance is "+balance+"Rs");
					
				}
				else
				{
					System.out.println("Insufficient Balance");
				}
				break;
				
			case 2:
				System.out.println("Enter Amount For Deposite:");
		
				deposit=sc.nextInt();
				
				balance=balance+deposit;
				System.out.println("Your Money has been Successfully Deposited");
				
				System.out.println("Your account balance is "+balance+"Rs");
				break;
			case 3:
				System.out.println("Accepting Your Request Of Balance Enquiery");
				
				System.out.println("Your Account Balance Is  "+balance+" rs");
				break;
			case 4:
				System.out.println("Accept your request for checking previousTransaction: ");
				
				previousTransaction=sc.nextInt();
				previousTransaction=previousTransaction+balance;
				System.out.println("your previousTransaction is "+previousTransaction+"");
				System.out.println("Your previousTransaction is successfully print");
				
				break;
			case 5:
				System.out.println("Thank you for using our services");
				System.exit(0);
			
				break;
			default:
				System.out.println("It's invalid choice : Try Again");
				break;
			}
		}
	}

	public static void main(String[] args) 
	{
		BankingApplication a1=new BankingApplication();
		a1.BankAccount();
		// TODO Auto-generated method stub

	}

}
