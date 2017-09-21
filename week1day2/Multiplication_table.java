package week1day2;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number : ");
		Scanner value = new Scanner(System.in);
		num = value.nextInt();
		for(int i=1;i<=10;i++)
		{
			int count = i * num;
			System.out.println( num+"*" +i+"="+count);
		}
			
	}
}




