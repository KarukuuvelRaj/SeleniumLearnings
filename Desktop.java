package org.system;

public class Desktop extends Computer {

	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}
	public void desktopSize() {
		System.out.println("The size of the desktop is: 15 inch");
	}
}
