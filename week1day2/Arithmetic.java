package week1day2;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		int number1;
		int number2;
		int result;
		String operation;
		System.out.println("Enter the first number :");
		Scanner value = new Scanner(System.in);
		number1 = value.nextInt();
		System.out.println("Enter the second number :");
		number2 = value.nextInt();
		System.out.println("Enter the operation to be done :");
		operation = value.next();
		switch(operation)
		{
		case "Addition":
			result = number1 + number2;
			System.out.println("Addition of number1 & number2 is " +result );
			break;
		
		case "Subtraction":
			result = number1 - number2;
			System.out.println("Subtraction of number1 & number2 is " +result );
			break;
			
		case "Multiplication":
			result = number1 * number2;
			System.out.println("Multiplication of number1 & number2 is " +result );
			break;
			
		case "Division":
			result = number1/number2;
			System.out.println("Division of number1 & number2 is " +result );
			break;

		}

	}
}




