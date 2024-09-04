package com.Exercise.javaProgram.Array;

//Design blueprint of a student object with the states id,name,age,Roll no and create on display method to display details of student.create a container to store five student object in it and display details of all student
public class ArrayProgram27_Student {
	int sid;
	String sname;
	int sage;
	int srollno;
	ArrayProgram27_Student(int sid,String sname,int sage,int srollno){
		this.sid=sid;
		this.sname=sname;
		this.sage=sage;
		this.srollno=srollno;
	}
	public void display() {
		System.out.println("******Details of Student******");
		System.out.println("Student ID: "+sid);
		System.out.println("Student Name: "+sname);
		System.out.println("Student Age: "+sage);
		System.out.println("Student Rollno: "+srollno);
	}

}
