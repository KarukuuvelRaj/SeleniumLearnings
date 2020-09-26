package org.student;

import org.department.Department;

public class Student extends Department {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeRank();
		obj.collegeCode();
		obj.deptName();
		obj.studentName();
		obj.studentId();
		obj.studentDept();
	}
	public void studentName() {
		System.out.println("The name of the student is: Raj");
	}
	public void studentDept() {
		System.out.println("The name of the department is: CSE");
	}
	public void studentId() {
		System.out.println("Student ID is: 10");
	}
}
