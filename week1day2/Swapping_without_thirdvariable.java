package week1day2;

import java.util.Scanner;

public class Swapping_without_thirdvariable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the numbers \n");
		int a= sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swap values are "+a+"&"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap values are "+a+"&"+b);
	}
}
