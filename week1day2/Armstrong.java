package week1day2;

public class Armstrong {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		int mod = 0;
		for (int i = 100; i <= 1000; i++) {
			num = i;
			while (num > 0) {
				mod = num % 10;
				count = (int) (count + Math.pow(mod, 3));
				num = num / 10;
			}
			if (count == i) {
				System.out.println(count);
			}
			count = 0;
		}
	}
}
