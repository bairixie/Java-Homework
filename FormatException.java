/*
 *   Author: Sean Mo    Date:04-24-2023
 *   Problem 4    Homework 10
 */
package h10;
import java.util.Scanner;

public class FormatException {

	public static void main(String[] args)
	{
		String binary;
		//Ask the user to input the binary
		Scanner pd = new Scanner(System.in);
		System.out.println("Enter the binary: ");
		binary=pd.nextLine();
		// output
		System.out.println();
		try {
    	    int decimal = FormatException.bin2Dec(binary);
    	    System.out.println("The decimal of the binary is: "+ bin2Dec(binary)); 
    	} catch (NumberFormatException f) {
    	    System.err.println(f.getMessage());
    	}

	}
	 public static int bin2Dec(String binary) throws NumberFormatException 
	 {
	        // Check input string is a binary string or not
	        for (int i = 0; i < binary.length(); i++) {
	            char ch = binary.charAt(i);
	            if (ch != '0' && ch != '1') {
	                throw new NumberFormatException("It is not a binary string");
	            }
	        }
	        
	        // Convert binary string to decimal 
	        int decimal=0;
			int power = 0;
			//processing the binary and do calculate to transfer binary to decimal
			for (int i =binary.length()-1 ; i>=0; i--)
			{
				if (binary.charAt(i)=='1')
				{
					decimal+=Math.pow(2, power);
				}
				power ++;
				
			}
			return decimal;
	    }
	   
	
}
