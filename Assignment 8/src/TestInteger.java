import java.util.Scanner;

public class TestInteger {

	public static void main(String[] args) {
		 int number;
		 
		 Scanner keyboard = new Scanner(System.in);
		 
		 System.out.print("Enter in a integer: ");
		 	number = keyboard.nextInt();
		 	
		 MyInteger a = new MyInteger();
		 
		 a.isEven(number);
		 a.isOdd(number);
		 a.isPrime(number);
	}
}