/*
 *   Author: Sean Mo    Date:03-20-2023
 *   Problem 4    Homework 7
 */
package H7;

import java.util.Scanner;

public class Location {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		// declare the variables
		System.out.println("Enter the number of row in the square matrix");
		int row = kb.nextInt();
		int largestSize = 0;
		int x = 0;
		int y = 0;
		int [][] array1 = new int[row][row];
		int [][] array2 = new int[row][row];
		// input the values of coordinates
		System.out.println(" Enter values of the square matrix with the only element 0 and 1: ");
		
		for (int r = 0; r < array1.length; r++)
		{
			for(int col= 0; col<array1[r].length; col++ )
			{
					array1[r][col]= kb.nextInt();
			}
		}
		// find the location and size of the first maximum square submatrix
		for (int i = 0; i < row; i++) 
		{
            for (int j = 0; j < row; j++) 
            {
                if (i == 0 || j == 0) 
                {
                    array2[i][j] = array1[i][j];
                } 
                else if (array1[i][j] == 1) 
                {
                    array2[i][j] = Math.min(array2[i-1][j], Math.min(array2[i][j-1], array2[i-1][j-1])) + 1;
                    
                }
                if (array2[i][j] > largestSize) 
                {
                    largestSize = array2[i][j];
                    x = i - largestSize + 1;
                    y = j - largestSize + 1;
                    
                }
            }
        }
		// output
        System.out.println("The maximum square submatrix is at " + "("+x+","+y+") with size "+ largestSize+".");
    }

}
