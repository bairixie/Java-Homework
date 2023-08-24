/*
 *   Author: Sean Mo    Date:03-20-2023
 *   Problem 3    Homework 7
 */
package H7;
import java.util.Scanner; 
public class Markov {
	//declare the array
	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		// declare the variables
		
		double [][] array1 = new double[3][3];
		// input the values of coordinates
		System.out.println(" Enter values of the 3x3 matrix");
		
		for (int row = 0; row < array1.length; row++)
		{
			for(int col= 0; col<array1[row].length; col++ )
			{
					array1[row][col]= kb.nextDouble();
			}
		}
		
		//output
		
		if (isMarkovMatrix( array1))
		{
			System.out.println(" It is a Markov matrix");
		}
		else
		{
			System.out.println(" It is not a Markov matrix");
		}
		
	}
	
	//method to check whether it is Markov Matrix
	
	public static boolean isMarkovMatrix(double [][] m)
	{
		boolean check = true;
		
		
			//check for positive
			for (int row = 0; row < m.length; row++)
			{
				double sum = 0;
				for(int col= 0; col<m[row].length; col++ )
				{
						if (m[col][row] > 0)
						{
							sum+=m[col][row];
							check = true;
						}
						else
						{ 
							check = false;
							return check;
						}
				}
			//check whether sum of the column is 1
				if (check)
				{
					if (sum!=1)
					{
						check = false;
						return check;
					}
					else
					{
						check = true;
					}
				}
		    }
		
			
		
		return check;
	}

}
