/*
 *   Author: Sean Mo    Date:03-27-2023
 *   Problem 2    Homework 8
 */

package h8;

public class RegularPolygon 
{
	//data or fields or properties
	private int n;
	private double side;
	private double x;
	private double y;
	
	//constructors
	
	public RegularPolygon()
	{
	  n=3;
	  side=1;
	  x=0;
	  y=0;
		
	}
	public RegularPolygon(int num, double len)
	{
		n=num;
		side=len;
		x=0;
		y=0;
	}
	public RegularPolygon(int num, double len,double a, double b)
	{
		n=num;
		side=len;
		x=a;
		y=b;
	}
	//The accessor and mutator methods for all data fields
	public int getN()
	{
		return n;
	}
	public void setN(int i)
	{ 
		n = i;
	}
	
	public double getSide()
	{
		return side;
	}
	public void setSide(double i)
	{ 
		side = i;
	}
	public double getX()
	{
		return x;
	}
	public void setX(double i)
	{ 
		x = i;
	}
	public double getY()
	{
		return y;
	}
	public void setSY(double i)
	{ 
		y = i;
	}
	public double getPerimeter()
	{
		return  side*n;
	}
	public double getArea()
	{
		return (n * side*side) / (4 * Math.tan ( Math.PI / n)) ;
	}
	
	
	public static void main(String[] args) 
	{
		RegularPolygon  r1 = new RegularPolygon();
		RegularPolygon  r2 = new RegularPolygon(6,4);
		RegularPolygon  r3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("The permimeter and area for no-arg constructor are: "+ r1.getPerimeter()+ " and " + r1.getArea());
        System.out.println("The permimeter and area for RegularPolygon(6, 4) are: "+ r2.getPerimeter()+ " and " + r2.getArea());
        System.out.println("The permimeter and area for g RegularPolygon(10, 4, 5.6, 7.8) are: "+ r3.getPerimeter()+ " and " + r3.getArea());
    }
	

}
