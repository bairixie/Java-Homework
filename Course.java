/*
 *   Author: Sean Mo    Date:04-03-2023
 *   Problem 2    Homework 9
 */
package h9;

public class Course 
{
	//data or fields or properties
	private String courseName;
	private String[] students;
	private int numberOfStudents;
	
	//constructor with one argument String
	public Course(String courseName) 
	{
		students = new String[100];
		this.courseName = courseName;
	}
	//method to addStudent
	public void addStudent(String student)
	{
		if (numberOfStudents == students.length)
		{
			String[] newStudents = new String[numberOfStudents+1];
			System.arraycopy(students, 0, newStudents, 0, numberOfStudents);
			students = newStudents;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	//getter methods
	public String[] getStudents()
	{
		return students;
	}
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	public String getCourseName() 
	{
        return courseName;
	}
	//method to drop student
	public void dropStudent(String student) 
	 {
		 int count = -1;
		 
		 for (int i=0; i < numberOfStudents; i++)
		 {
			 if (students[i].equals(student))
			 {
				 count = i;
			 }
		 }
		 if (count!= -1)
		 {
			 for (int i =0; i < numberOfStudents -1; i++)
			 {
				 students[count]=students[count+1];
			 }
			 numberOfStudents--;
		 }
			 
	 }
	//method to clear the students
	public void clear()
	{
		students=new String[100];
		numberOfStudents=0;
	}
	//test program
	public static void main(String[] args) 
	{
        Course course = new Course("Intro to CS");
        course.addStudent("Sean");
        course.addStudent("Mo");
        course.addStudent("Zhihao");
        course.dropStudent("Mo");
        for (int i = 0; i<course.getNumberOfStudents(); i++)
        {
        	System.out.println( course.students[i]);
        }
        System.out.println("Number of students: " + course.getNumberOfStudents());
    
       
        
    }

}
