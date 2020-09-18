package week1.assignments;

public class SwitchOperator {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		String var="Add";
		switch (var) {
		case "Add":
			int sum=a+b;
			System.out.println("The result is: "+sum);
			break;
		case "Sub":
			int sub=a-b;
			System.out.println("The result is: "+sub);
			break;
		case "Mul":
			double mul=a*b;
			System.out.println("The result is: "+mul);
			break;
		case "Div":
			double div=a/b;
			System.out.println("The result is: "+div);
		default:
			int mod=a%b;
			System.out.println("The result is: "+mod);
			break;
		}
	}
}