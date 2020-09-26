package org.override;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	}
	public void deposit() {
		System.out.println("The maximum deposit amount is: 100Crore");
	}
}
