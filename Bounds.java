/*
 *   Author: Sean Mo    Date:04-24-2023
 *   Problem 3    Homework 10
 */
package h10;
import java.util.Random;
import java.util.Scanner;
public class Bounds {

	public static void main(String[] args) 
	{
		// create a new random to generate the random number
		Scanner pd = new Scanner(System.in);
		Random num = new Random();
		// create the new array and set the size of the array
		int array []= new int [100];
		// assign each value of the array in random
		for (int i = 0; i < array.length; i++)
		{
			array[i]=num.nextInt();
		}
		// prompt the user to enter the index
		System.out.println("Enter the index of the array: ");
		int id = pd.nextInt();
		//output 
		if (id >=array.length)
		{
			System.out.println("Out of Bounds");
		}
		else
		{
			System.out.println("The valus is "+ array[id]);
		}

	}
}
