package week1day2;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter a number : ");
		Scanner value = new Scanner(System.in);
		number = value.nextInt();
		if(number>18)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("You're not Adult");
		}
	}

}
