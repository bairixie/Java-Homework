/*
 *   Author: Sean Mo    Date:03-27-2023
 *   Problem 4    Homework 8
 */
package h8;
import java.util.*;
public class Location
{
	//data or fields or properties
	public int row;
	public int column;
	public double maxValue;
	
	//constructors
	public Location(int r, int c, double max)
	{
		row = r;
		column = c;
		maxValue = max;
	}
	//method
	public static Location locateLargest(double [][] a)
	{
		int maxRow = 0;
		int maxColumn = 0;
		double maxValue = a [maxRow][maxColumn];
		for (int i =0; i < a.length; i++)
		{
			for (int j =0; j< a[i].length; j++)
			{
				if (a[i][j]> maxValue)
				{
					maxRow=i;
					maxColumn = j;
					maxValue = a[i][j];
					
				}
			}
		}
		return new Location (maxRow, maxColumn, maxValue);
	}
	
	public static void main(String[] args) 
	{
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = kb.nextInt();
        int column = kb.nextInt();
        
        System.out.println("Enter the array: ");
        double [][] array = new double [row][column];
        for (int i=0; i < row; i++)
        {
        	for (int j=0; j < column; j++)
        	{
        		array[i][j]=kb.nextDouble();
        	}
        }
        Location loc = Location.locateLargest(array);
        
        System.out.println("The largest element is " + loc.maxValue+ ", and it is located at "+  "("+ loc.row+ ","+ loc.column+")" );
        
	}    
        
        
              

}


