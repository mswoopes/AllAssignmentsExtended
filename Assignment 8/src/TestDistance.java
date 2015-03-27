import java.util.Scanner;

public class TestDistance {

	public static void main(String[] args) {
		int x1;
		int x2;
		int y1;
		int y2;
		
		Scanner keyboard = new Scanner(System.in);
		 
		System.out.print("Enter in the x1 coordinate: ");
		 	x1 = keyboard.nextInt();
		 	
		System.out.print("Enter in the y1 coordinate: ");
		 	y1 = keyboard.nextInt();
		 	
		System.out.print("Enter in the x2 coordinate: ");
		 	x2 = keyboard.nextInt();
		 	
		System.out.print("Enter in the y2 coordinate: ");
		 	y2 = keyboard.nextInt();
		 	
		TheDistance d = new TheDistance();
		d.distance(x1, x2, y1, y2);
	}
}