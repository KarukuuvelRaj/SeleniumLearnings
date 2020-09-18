package week1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=14;
		boolean flag=false;
		for (int i = 2; i <= input/2; ++i) {
			if(input%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");
	}
}

