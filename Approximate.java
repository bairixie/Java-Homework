/*
 *   Author: Sean Mo    Date:04-03-2023
 *   Problem 4    Homework 9
 */
package h9;
import java.math.BigDecimal;
public class Approximate 
{
	public static void main(String[] args) 
	{
		// iteration for i 
		for (int i=100; i <= 1000; i+=100)
		{
			
			BigDecimal sum = new BigDecimal("1");
			BigDecimal denominator = new BigDecimal("1");
			BigDecimal numerator= new BigDecimal("1");
			//processing
			for (int j=1;j<=i;j++)
			{
				//calculate each denominator in the formula
				denominator = denominator.multiply(BigDecimal.valueOf(j));
				//divide each denominator then add all of them together
				sum = sum.add(numerator.divide(denominator,24, BigDecimal.ROUND_HALF_UP));
				
			}
			//output
			System.out.println("When i = "+i+" , e = "+ sum);
		}
	}

}
