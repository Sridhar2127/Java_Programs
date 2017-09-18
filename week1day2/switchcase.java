package week1day2;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter a number : ");
		Scanner value = new Scanner(System.in);
		number = value.nextInt();
		switch(number)
		{
		case 1:
			System.out.println("Please wait for a while");
			//break;

		case 2:
			System.out.println("Be ready");
			//break;

		case 3:
			System.out.println("You may go");
			//break;
			
		default:
			System.out.println("Quit");
			//break;
		}
	}

}
