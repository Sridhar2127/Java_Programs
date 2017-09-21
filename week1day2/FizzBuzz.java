package week1day2;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		int num1, num2;
		System.out.println("Enter first number : ");
		Scanner value = new Scanner(System.in);
		num1 = value.nextInt();
		System.out.println("Enter second number : ");
		num2 = value.nextInt();
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0 & i % 5 == 0) {
				System.out.println("FIZZBOX");
			} else if (i % 3 == 0) {
				System.out.println("FIZZ");

			} else if (i % 5 == 0) {
				System.out.println("BUZZ");
			} else {
				System.out.println(i);

			}
		}

	}
}
