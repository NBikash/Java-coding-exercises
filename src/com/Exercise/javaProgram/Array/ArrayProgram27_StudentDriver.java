package com.Exercise.javaProgram.Array;

public class ArrayProgram27_StudentDriver {
	public static void main(String[] args) {
		ArrayProgram27_Student[] student=new ArrayProgram27_Student[5];
		student[0]=new ArrayProgram27_Student(101,"Abhishek",16,1);
		student[1]=new ArrayProgram27_Student(102,"Ritesh",16,1);
		student[2]=new ArrayProgram27_Student(103,"Sakib",16,1);
		student[3]=new ArrayProgram27_Student(104,"Rahul",16,1);
		student[4]=new ArrayProgram27_Student(105,"Deepak",16,1);
	
	for(ArrayProgram27_Student s:student) {
		s.display();
	}

}
}
