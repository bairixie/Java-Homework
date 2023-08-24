/*
 *   Author: Sean Mo    Date:03-27-2023
 *   Problem 1    Homework 8
 */



package h8;
import java.util.*;

public class Account 
{
	//data or fields or properties
	private int id;
	private double balance, annualInterestRate;
	private Date dateCreated;
	
	// no-arg constructor that creates a default account
	public Account()
	{
		 id = 0;
	     balance = 0;
	     annualInterestRate = 0;
	     dateCreated = new Date();
	}
	//constructor that creates an account with the specified “id” and initial balance
	public Account(int a, double b)
	{
		id = a;
		balance = b;
		annualInterestRate = 0;
	    dateCreated = new Date();
	}
	//The accessor and mutator methods for “id”, “balance” and “annualInterestRate”
	public int getId()
	{
		return id;
	}
	public void setId(int i)
	{ 
		id = i;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double bal)
	{ 
		balance = bal;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double ann)
	{ 
		annualInterestRate = ann;
	}
	//The accessor method for “dateCreated”
	public Date getDateCreated()
	{
		return dateCreated;
	}
	
	public double getMonthyInterestRate()
	{
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest()
	{
		return balance*getMonthyInterestRate();
	}
	 
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public void deposit (double amount)
	{
		balance += amount;
	}
	
	public static void main(String[] args)
	{
        Account r = new Account(1122, 20000);
        r.setAnnualInterestRate(0.045);

        r.withdraw(2500);
        r.deposit(3000);

        System.out.println("The balance is: $" + r.getBalance());
        System.out.println("The monthly interest is: $" + r.getMonthlyInterest());
        System.out.println("The date created is: " + r.getDateCreated());
    }
	
}



    

