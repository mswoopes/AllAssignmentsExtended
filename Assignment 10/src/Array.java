import java.util.Scanner; // Needed for Scanner class

public class Array {
	
	static int i = 0;
	static int NUMBERS;
	
	public static void main(String[] args) {
		

		Scanner keyboard = new Scanner(System.in);

		System.out.println("This program will find the highest, lowest, average and the sum of the numbers that "
				+ "you will enter");			
		
		System.out.println("How many numbers do you want to enter?");
			NUMBERS = keyboard.nextInt();
		
		int[] array = new int[NUMBERS];
		
		getValues(array);
		showRange(array);
		showTotal(array, i, NUMBERS);
		showAverage(array, i, NUMBERS);
	}
	
	public static void showRange (int[] array)
	{
		 int smallest = array[0];
         int largest = array[0];
        
         for(int j=1; j< array.length; j++)
         {
                 if(array[j] > largest)
                         largest = array[j];
                 else if (array[j] < smallest)
                         smallest = array[j];
         }
         System.out.println("Highest element is " + largest);
         System.out.println("Lowest element is " + smallest);
	}

	public static void showTotal (int[] array, int i, int NUMBERS)
	{
		int total = 0;
		int holder = 0;
		
		while (i != NUMBERS) {
			holder = array[i];
			total = total + holder;
			i++;
		}
		
		System.out.println("The sum of the elements are " + total);
	}
	
	public static void showAverage (int[] num, int i, int NUMBERS)
	{
		int total = 0;
		int holder = 0;
		
		while (i != NUMBERS) {
			holder = num[i];
			total = total + holder;
			i++;
		}
		
		total = total/NUMBERS;
		System.out.println("The average of the elements are " + total);
	}
	
	private static void getValues(int[] array) {
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a series of " + array.length + " numbers.");

		for (int index = 0; index < array.length; index++) {
			System.out.print("Enter number " + (index + 1) + ": ");
	        	array[index] = keyboard.nextInt();
	    }
	}
}