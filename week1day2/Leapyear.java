package week1day2;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		System.out.println("Enter a year to check whether it is leap year or not : ");
		Scanner value = new Scanner(System.in);
		int year = value.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Given leap is leap year");
				} else {
					System.out.println("Given year is NOT leap year");
				}
			} else {
				System.out.println("Given number is leap year");
			}
		} else {
			System.out.println("Given year is NOT leap year");
		}
	}

}
