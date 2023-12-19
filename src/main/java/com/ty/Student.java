package com.ty;

public class Student {
	
	private String student_Name;
	
	private String City;
	
	
	
	
	
	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public void printName()
	{
		System.out.println("Student Name : "+student_Name);
		System.out.println("Student City : "+City);
	}
	
	public Student(String name,String city) {
	
		this.student_Name=name;
		this.City=city;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
 

}
