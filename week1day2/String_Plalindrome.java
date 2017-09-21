package week1day2;

import java.util.Scanner;

public class String_Plalindrome {

	public static void main(String[] args) {
		int i;
		String reversedname = "";
		System.out.println("Enter any name to check whether it is palindrome or not: ");
		Scanner value = new Scanner(System.in);
		String actualname = value.next();
		int strlength = actualname.length();
//		System.out.println("Length is : "+strlength);
		for (i=strlength-1;i>=0;i--)
		{
			reversedname = reversedname + actualname.charAt(i);//charAt(i) will get the character at the index of i
			
		}
		System.out.println("Reversed Name is : " +reversedname);
		
		if(actualname==reversedname)
		{
			System.out.println("Given name is a Palindrome!");
		}
		else
		{
			System.out.println("Given name is not a Palindrome!");
		}
	}
}




