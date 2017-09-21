package week1day2;

import java.util.Scanner;

		public class Sample {
			public static void main(String args[]) {
				int res = 0;
				String str = "111";

				char[] chars = str.toCharArray();
				for (int i = 0, n = chars.length; i < n; i++) {
					// char c = chars[i];
					if (chars[i] % 2 != 0) {

						res = res + Character.getNumericValue(chars[i]);
					}
				}
				System.out.println(res);
			}
}




