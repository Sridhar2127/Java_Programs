package week1day2;

import java.util.Scanner;

public class print_name_age {

	public static void main(String[] args) {
	int age;
	String name;
	System.out.println("Enter your Age : ");
	Scanner value = new Scanner(System.in);
	age = value.nextInt();
	System.out.println("Enter your Name : ");
	name = value.next();
	System.out.println("Your age is " +age);
	System.out.println("Your name is " +name);
	
	}

}
