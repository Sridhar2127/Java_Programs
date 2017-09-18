package Conditions;

import java.util.Scanner;

public class Condition {
	public static void main(String args[])
	{
		int number;
		System.out.println("Enter a whole number : ");
		Scanner value = new Scanner(System.in);
		number = value.nextInt();
		if(number%2==0)
		{
			System.out.println("Entered number is Even number");
		
		}
		else
		{
			System.out.println("Entered number is Odd number");
		}
	}
}
