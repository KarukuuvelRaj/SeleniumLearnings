package org.overloading;

public class Students {

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(01);
		obj.getStudentInfo(01, "Raj");
		obj.getStudentInfo("raj007@gmail.com", 1234567890);
	}
	public void getStudentInfo(int id) {
		System.out.println("The Student id is: "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The student id and the Student name is: "+id+", "+name);
	}
	public void getStudentInfo(String email, int phoneNum) {
		System.out.println("The student email id and the phone number is: "+email+", "+phoneNum);
	}
}
