/*
 *   Author: Sean Mo    Date:03-27-2023
 *   Problem 3    Homework 8
 */
package h8;
import java.util.*;
public class LinearEquation 
{
	//data or fields or properties
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	//constructors
	public LinearEquation(double na, double nb, double nc, double nd, double ne, double nf)
	{
		a=na;
		b=nb;
		c=nc;
		d=nd;
		e=ne;
		f=nf;
	}
	//Six getter methods for a, b, c, d, e, and f
	public double getA()
	{
		return a;
	}
	public double getB()
	{
		return b;
	}
	public double getC()
	{
		return c;
	}
	public double getD()
	{
		return d;
	}
	public double getE()
	{
		return e;
	}
	public double getF()
	{
		return f;
	}
	public boolean  isSolvable()
	{
		return a*d-b*c!=0;
	}
	public double getX()
	{
		double result = (e*d-b*f)/(a*d-b*c);
		return result;
	}
	public double getY()
	{
		double result = (a*f-e*c)/(a*d-b*c);
		return result;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter the values of a,b,c,d,e,f ");
        double a = kb.nextDouble();
        double b = kb.nextDouble();
        double c = kb.nextDouble();
        double d = kb.nextDouble();
        double e = kb.nextDouble();
        double f = kb.nextDouble();
        
        LinearEquation r = new LinearEquation(a, b, c, d, e, f);
        if (r.isSolvable())
        {
        	System.out.println("The x is: " + r.getX()+ " and the y is: " + r.getY());
        }
        else
        {
        	System.out.println(" The equation has no solution ");
        }

    }
	

}
