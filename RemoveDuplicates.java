/*
 *   Author: Sean Mo    Date:04-24-2023
 *   Problem 1    Homework 10
 */

package h10;


import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
	  public static void main(String[] args) 
	    {
	        // Create a new ArrayList to store the integers
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        // Input 10 integers to the list
	        Scanner pd = new Scanner(System.in);
	        System.out.print("Enter 10 integers: ");
	        for (int i = 0; i < 10; i++) {
	            int number = pd.nextInt();
	            list.add(number);
	        }
	        
	        // Remove the duplicates from the list
	        removeDuplicates(list);
	        
	        // Display the distinct integers in the list
	        System.out.print("The distinct integers are: ");
	        for (int i = 0; i<list.size(); i++) {
	            System.out.print(list.get(i) + " ");
	        }
	    }
	    

public static void removeDuplicates(ArrayList<Integer> list) 
{
	    // Create a new ArrayList to store the distinct integers
	    ArrayList<Integer> distinct = new ArrayList<Integer>();
	    
	    // Loop through the original list and add each element to the distinct if it is not already in the distinct
	    for (int i = 0; i<list.size(); i++) {
	        if (!distinct.contains(list.get(i))) {
	            distinct.add(list.get(i));
	        }
	    }
	    
	    // Clear list and add the elements inn distinct to it
	    list.clear();
	    for (int i = 0; i<distinct.size(); i++ ) 
	    {
	        list.add(distinct.get(i));
	    }
	}

	

}
