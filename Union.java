/*
 *   Author: Sean Mo    Date:04-24-2023
 *   Problem 2    Homework 10
 */

package h10;
import java.util.Scanner;
import java.util.ArrayList;
import h10.RemoveDuplicates;
public class Union 
{

	public static void main(String[] args) 
	{
		 ArrayList<Integer> list1 = new ArrayList<Integer>();
		 ArrayList<Integer> list2 = new ArrayList<Integer>();
		
	        // Input 10 integers to the list 1
	        Scanner pd = new Scanner(System.in);
	        // input the value for the first list
	        System.out.print("Enter 5 integers for the first list: ");
	        for (int i = 0; i < 5; i++) {
	            int number = pd.nextInt();
	            list1.add(number);
	        }
	        // input the value for the second list
	        System.out.print("Enter 5 integers for the second list: ");
	        for (int i = 0; i < 5; i++) {
	            int number = pd.nextInt();
	            list2.add(number);
	        }
	        // Display the union integers in the list
	        ArrayList<Integer> result= union(list1, list2);
	        System.out.print("Their union is: ");
	        for (int i = 0; i<result.size(); i++) {
	            System.out.print(result.get(i) + " ");
	        }
	}
	
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
		 
		 ArrayList<Integer> union = new ArrayList<Integer>();
		 
		 //remove the duplicates in the first and second list using the method from problem1
		 h10.RemoveDuplicates.removeDuplicates(list1);
		 h10.RemoveDuplicates.removeDuplicates(list2);
		 // add the value to the union
		 for (int i = 0; i<list1.size(); i++ ) 
		    {
		        union.add(list1.get(i));
		    }
		 for (int i = 0; i<list2.size(); i++ ) 
		    {
		        union.add(list2.get(i));
		    }
		 // remove the duplicates in the union
		 h10.RemoveDuplicates.removeDuplicates(union);
		 
		return union;
		 
	}

}
