package com.montran.main;

import java.util.Scanner;

import com.montran.pojo.Current;
import com.montran.pojo.Savings;

public class AccountMainV7 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int accountNumber;
		String name;
		double balance;
		int amount;
		int trainsactionChoice;
		String continueChoice;
		boolean result;
		int accountChoice;
		boolean isSalary=false;
		double overdraft;

		System.out.println(" Hello Welcome to XYZ Bank !!");
		System.out.println("Account choice menu :");
		System.out.println("Please select account type");
		System.out.println("1.. Savings");
		System.out.println("2.. Current");
		System.out.println("Enter your account choice");
		accountChoice=scanner.nextInt();
		
		switch (accountChoice) {
		case 1:
			System.out.println("Do you want to open salary account (true-false)");
			isSalary = scanner.nextBoolean();
			
			System.out.println("Enter account Number");
			accountNumber = scanner.nextInt();

			System.out.println("Enter Name");
			name = scanner.next();

			System.out.println("Enter Balance");
			balance = scanner.nextDouble();
			
			System.out.println("your account opened successfully!!"); 
			
			Savings savings=new Savings(accountNumber, name, balance, isSalary);
			
			do {
				System.out.println("Menu");
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3.Print Balance");
				System.out.println("Enter your choice");
				trainsactionChoice = scanner.nextInt();

				switch (trainsactionChoice) {
				case 1:
					System.out.println("Enter amount to withdraw");
					amount = scanner.nextInt();
					result = savings.withdraw(amount);
					if (result)
						System.out.println("Transaction Success !!");
					else
						System.out.println("Transaction Failed !!");
					break;
				case 2:
					System.out.println("Enter amount to deposit");
					amount = scanner.nextInt();
					result = savings.deposit(amount);
					if (result)
						System.out.println("Transaction Success !!");
					else
						System.out.println("Transaction Failed !!");
					break;
				case 3:
					System.out.println(savings);
				//	System.out.println("Account Balance :: " + savings.getBalance());
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}

				System.out.println("Do you want to continue ?");
				continueChoice = scanner.next();
				
			} while (continueChoice.equals("yes"));
		
			if(continueChoice.equals("no"))
			{
				
				System.out.println("Thank you for banking with us!!");
			}
			break;
		case 2:
			System.out.println("Enter overdraft");
			overdraft=scanner.nextDouble();
			
			System.out.println("Enter account Number");
			accountNumber = scanner.nextInt();

			System.out.println("Enter Name");
			name = scanner.next();

			System.out.println("Enter Balance");
			balance = scanner.nextDouble();
			
			System.out.println("your account opened successfully!!"); 
			
			Current c=new Current(accountNumber ,name,balance,overdraft);
			do
			{
			System.out.println("Enter choice");
			System.out.println("1.Withdraw");
			System.out.println("2.deposit");
			System.out.println("3.Print Balance");
			
		
			trainsactionChoice = scanner.nextInt();
			
			switch (trainsactionChoice) 
			{
			case 1:
			System.out.println("Enter amount to withdraw");
		    amount=scanner.nextInt();
			c.withdraw(amount);
			System.out.println(c);
			break;					
			case 2:		
					//balance = 0 overdraftbalance = 47000
			System.out.println("Enter amount to deposit");
			 amount=scanner.nextInt();
			c.deposit(amount);
			System.out.println(c);
			break;
			case 3:
				System.out.println(c);
			//	System.out.println("Overdraft Balance :: " + c.getOverdraftBalance());
			//	System.out.println("Main Balance :: " + c.getBalance());
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}	
		    System.out.println("Do you want to continue ?");
			continueChoice = scanner.next();
			} while (continueChoice.equals("yes"));
			
			if(continueChoice.equals("no"))
			{
				System.out.println("Thank you for banking with us!!");
			}
	        break;
	    	default:
	    		System.out.println("Invalid choice");
			break;
		}
		
		
		
		}
	}


//OutPut:
Hello Welcome to XYZ Bank !!
Account choice menu :
Please select account type
1.. Savings
2.. Current
Enter your account choice

2
Enter overdraft
50000
Enter account Number
123
Enter Name
dddd
Enter Balance
10000
your account opened successfully!!

Enter choice
1.Withdraw
2.deposit
3.Print Balance
3
Current [overdraftBalance=50000.0, getAccountNumber()=123, getName()=dddd, getBalance()=10000.0]
Do you want to continue ?
yes
Enter choice
1.Withdraw
2.deposit
3.Print Balance
1
Enter amount to withdraw
3000
Current [overdraftBalance=50000.0, getAccountNumber()=123, getName()=dddd, getBalance()=7000.0]
Do you want to continue ?
yes
Enter choice
1.Withdraw
2.deposit
3.Print Balance
15000
Invalid choice
Do you want to continue ?
yes
Enter choice
1.Withdraw
2.deposit
3.Print Balance
1
Enter amount to withdraw
15000
Current [overdraftBalance=42000.0, getAccountNumber()=123, getName()=dddd, getBalance()=0.0]
Do you want to continue ?
yes

Enter choice
1.Withdraw
2.deposit
3.Print Balance
2
Enter amount to deposit
5000
Current [overdraftBalance=47000.0, getAccountNumber()=123, getName()=dddd, getBalance()=0.0]
Do you want to continue ?
yes
Enter choice
1.Withdraw
2.deposit
3.Print Balance
2
Enter amount to deposit
10000
Current [overdraftBalance=50000.0, getAccountNumber()=123, getName()=dddd, getBalance()=7000.0]
Do you want to continue ?
no
Thank you for banking with us!!

