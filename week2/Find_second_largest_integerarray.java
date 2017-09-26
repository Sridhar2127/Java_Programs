package week2;

import java.util.Arrays;

public class Find_second_largest_integerarray {

	public static void main(String[] args) {
		int a[] = { -2,-3,-1,0,4};
		Arrays.sort(a);
		int largest = a[0];
		int secondlargest = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secondlargest = largest;
				largest = a[i];

			} 
//			else if (a[i] > secondlargest) {
//				secondlargest = a[i];

//			}
		}
		System.out.println(secondlargest+" is the second largest number.");

	}

}
