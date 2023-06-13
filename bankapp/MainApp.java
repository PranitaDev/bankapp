package com.bankapp;
import java.util.Scanner;

class BankAccount
{
	int balance, preTransaction;
	String customerName,customerId;
	
	BankAccount(String cName,String cId)
	{
		customerName=cName;
		customerId  =cId;
	}
	void deposite(int amount)
	{
		if(amount != 0)
		{
			balance=balance+amount;
			preTransaction=amount;
		}
		System.out.println("You have deposited "+balance);
	}
	
	void withdraw(int amount)
	{
		if(amount !=0)
		{
			balance=balance-amount;
			preTransaction=amount;	
		}
		System.out.println("You have withdrawn your balance " +balance);
	}
	
	void getPreviousTransaction()
	{
		if(preTransaction>0)
		{
			System.out.println("Deposited: "+preTransaction);
		}
		else if(preTransaction<0)
		{
			System.out.println("Withdrawn :"+Math.abs(preTransaction));
			// it convert negative value to positive
		}
		else
		{
			System.out.println("NO transaction is occured.  ");
		}
	}
	
	void showMenu()
	{
		char option ='\0';
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome "+customerName);
		System.out.println("Your ID is : "+customerId+"\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposite");
		System.out.println("C. withdraw ");
		System.out.println("D. Previous transaction ");
		System.out.println("E. Exit");
		
		do
		{
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.println("Enter The Option");
		    option=sc.next().charAt(0);
		    Character.toUpperCase(option);
		    
		    switch(option)
		    {
		    case 'A':
		    	System.out.println("--------------------------------");
		    	System.out.println("Balance is "+balance);
		    	System.out.println();
		    	break;
		    	
		    case 'B':
		    	System.out.println("--------------------------------");
		    	System.out.println("Enter the amount to deposite");
		    	int amount=sc.nextInt();
		    	deposite(amount);
		    	System.out.println();
		    	break;
		    	
		    case 'C':
		    	System.out.println("--------------------------------");
		    	System.out.println("Enter the amount to withdraw");
		    	int amount2 =sc.nextInt();
		    	withdraw(amount2);
		    	System.out.println();
		    	break;
		    	
		    case 'D':
		    	System.out.println("--------------------------------");
		    	getPreviousTransaction();
		    	System.out.println();
		    	break;
		    
		    case 'E':
		    	System.out.println("--------------------------------");
		    	break;
		    	
		    default : System.out.println("Invalid Option!!  Please try again");
		        break;
		    }
		}while(option!='E');
		System.out.println("Thanku for using our service.");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
	}
}


public class MainApp 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount bank1=new BankAccount("Pranita","101");
		bank1.showMenu();
	}
}
