/*
 *   Author: Sean Mo    Date:04-03-2023
 *   Problem 3    Homework 9
 */
package h9;

import h8.Account;

public class Queue 
{
	//data or fields or properties
	private int[] elements ;
	private int size;
	public static final int DEFAULT_CAPACITY = 8;
	
	//Construct a Queue with the default capacity 8
	public Queue() 
	{
		this (DEFAULT_CAPACITY);
		
	}
	//Construct a stack with the specified maximum capacity
	public Queue(int capacity) 
	{
		elements = new int[capacity];
	}
	
	// Push a new integer to the top 
	public void enqueue(int v)
	{
		if(size >= elements.length)
		{
			int [] temp = new int[elements.length*2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
			
		}
		elements[size++] = v;
	}
	//Return and remove the first element 
	public int dequeue()
	{
		int element=0;
		if (size!=0)
		{
			element = elements[0];
			System.arraycopy(elements, 1, elements, 0, --size);
			
		}
		return element;
	}
	// Test whether the stack is empty
	public boolean empty()
	{
		return size==0;
	}
	// Return the number of elements in the Queue
	public int getSize()
	{
		return size;
	}
	
	public static void main(String[] args) 
	{
		Queue number = new Queue();
		for(int i =1; i<21; i++)
		{
			number.enqueue(i);
		}
		while (!number.empty())
		{
			System.out.println(number.dequeue()+"");
			System.out.println(number.getSize());
		}
		
	}
}
