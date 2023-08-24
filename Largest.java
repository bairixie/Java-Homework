/*
 *   Author: Sean Mo    Date:03-20-2023
 *   Problem 1    Homework 7
 */

package H7;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// declare
		double [][] array1;
		int [] array2;
		int sizeRow, sizeColumn;
		Scanner kb = new Scanner(System.in);
		System.out.print(" Enter the size of the rows and columns: ");
		sizeRow = kb.nextInt();
		sizeColumn = kb.nextInt();
		array1 = new double [sizeRow][sizeColumn];
		
		//input the values of the two dimensional array
		System.out.println(" Enter values of the array");
	
		for (int row = 0; row < array1.length; row++)
		{
			for(int col= 0; col<array1[row].length; col++ )
			{
					array1[row][col]= kb.nextDouble();
			}
		}
		
		array2 = locateLargest(array1);
			
		
			System.out.println("Row: " + array2[0]+ " Column: " +array2[1] );
			
		
	}
	//method to locate the largest element
	public static int [] locateLargest(double [][] a)
	{
		int row = 0;
		int col = 0;
		double largest = a[0][0];
		
		for (int i = 0; i < a.length; i++)
		{ 
			for(int j = 0; j<a[i].length; j++)
			{
				if (a[i][j] > largest)
				{
					largest = a[i][j];
					row = i;
					col = j;
				}
			}
		}
		int[] location = {row, col};
		return location;
	}

}