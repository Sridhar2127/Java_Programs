package week1day2;

import java.util.Scanner;

public class nested_if {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter a number : ");
		Scanner value = new Scanner(System.in);
		number = value.nextInt();
		if(number==1)
		{
			System.out.println("Please wait for a while");
		}
		else if(number==2)
		{
			System.out.println("Be ready");
		}
		else if(number==3)
		{
			System.out.println("You may go");
		}
	}

}
