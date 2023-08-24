/*
 *   Author: Sean Mo    Date:04-03-2023
 *   Problem 1    Homework 9
 */
package h9;
import java.util.Scanner;

import h8.Account;

public class ATM_Machine 
{

	public static void main(String[] args) 
	{
		Account[] accounts = new Account[10];
		
		Scanner kb = new Scanner(System.in);
		// assign id and initial values
		
		for (int i=0; i<accounts.length; i++)
		{
			 accounts[i] = new Account(i,100);
		}
		
		
		
		while(true)
		{	//input id
			boolean k = true;
			System.out.println("Enter an id (0-9): ");
			int id = kb.nextInt();
			while (k)
			{
				//check whether id is valid
				if (id<0 || id > 9)
				{
					System.out.println("Enter an correct id (0-9): ");
					id = kb.nextInt();
					
				}
				else
				{
					k = false;
				}
			}
			
			
	         
	         int choice = 0;
	         // show menu and let user make choice and show output
	         while(choice != 4)
	         {
	        	 System.out.println("Main menu");
		         System.out.println("1: check balancee");
		         System.out.println("2: withdraw");
		         System.out.println("3: deposit");
		         System.out.println("4: exit");
		         
		         System.out.println("Enter a choice: ");
		         choice = kb.nextInt();
	        	 if (choice == 1)
	        	 {
	        		 System.out.println("The balance is " + accounts[id].getBalance());
	        		 choice = 0;
	        	 }
	        	 else if (choice ==2)
	        	 {
	        		 System.out.println("Enter amount to withdraw: ");
	        		 double out = kb.nextDouble();
	        		 accounts[id].withdraw(out);
	        		 choice=0;
	        	 }
	        	 else if (choice ==3)
	        	 {
	        		 System.out.println("Enter amount to deposit: ");
	        		 double in = kb.nextDouble();
	        		 accounts[id].deposit(in);
	        		 choice=0;
	        	 }
	        	 else if (choice == 4)
	        	 {
	        		 continue;
	        	 }
	         
	        	 else
	        	 {
	        		 System.out.println("invalid choice ");
	        	 }
	         
	         }
		}
			
		

		

	}

}
