package week1.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] input = {10,34,890,45};
		Arrays.sort(input); 
		for (int i = input.length-2; i < input.length;) {
			System.out.println("The second largest number is: "+input[i]); 
			break;
		}
	}

}
