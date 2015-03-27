public class MyInteger {
	
	public static void isEven(int number) {
		if (number%2 == 0)
			System.out.println("isEven true");
		else
			System.out.println("isEven false");			
	}
	
	public static void isOdd(int number) {
		if (number%2 == 1)
			System.out.println("isOdd true");
		else
			System.out.println("isOdd false");			
	}
	
	public static void isPrime(int number) {
		int num = 2;
		while (num < number) {
			if (number%num == 0)
				num = number + 1;
			else
				num++;
		}
		if (num == number)
			System.out.println("isPrime true");
		else
			System.out.println("isPrime false");
		
	}
}