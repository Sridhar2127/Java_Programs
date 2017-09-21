package week1day2;

import java.util.Scanner;

public class Odd_number_addition {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		Scanner value = new Scanner(System.in);
		System.out.println("Enter any number : ");
		num = value.nextInt();
		while(num>0)
		{
			int rem = num%10;
			if(rem%2!=0)
			{
				count = count + rem;
				num=num/10;
				
			}		
		}
		System.out.println(count);
	}
}






