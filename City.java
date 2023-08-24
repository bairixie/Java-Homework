/*
 *   Author: Sean Mo    Date:03-20-2023
 *   Problem 2    Homework 7
 */

package H7;

import java.util.Scanner;

public class City {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		// declare the variables
		int city;
		System.out.print("Enter the number of cities: ");
		city = kb.nextInt();
		double [] x = new double[city];
		double [] y = new double[city];
		// input the values of coordinates
		for(int i=0; i < city; i++)
		{
			System.out.print("Enter the coordinates of the city x and y: ");
			x[i] = kb.nextDouble();
			y[i] = kb.nextDouble();
		}
		
		int central = 0;
		double minTotalDistance=0;
		// calculate the distance for the first coordinate and let it be the min
		for (int i=0;i<city;i++)
		{
			double minDistance = Math.sqrt(Math.pow(x[0]-x[i], 2) + Math.pow(y[0]-y[i], 2));
			minTotalDistance += minDistance;
		}
		// compare the min with other coordinate
		for (int i=0; i<city; i++)
		{
			double totalDistance = 0;
			for (int j=0; j<city; j++)
			{
				double distance = Math.sqrt(Math.pow(x[i]-x[j], 2) + Math.pow(y[i]-y[j], 2));
				totalDistance+= distance;
			}
		    if (totalDistance < minTotalDistance)
		    {
		    	minTotalDistance = totalDistance;
		    	central = i;
		    	
		    }
		   
		
		}
		// output
		System.out.println("The coordinates of the central city is: "+ "("+x[central] +","+ y[central]+")");
		System.out.println("The total distance is: "+ minTotalDistance);

	}

}
