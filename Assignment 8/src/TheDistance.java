public class TheDistance {
	
	public static void distance(int x1, int x2, int y1, int y2) {
		int x = x2 - x1;
		int y = y2 - y1;
		double z;
		
		x = (int) Math.pow(x, 2);
		y = (int) Math.pow(y, 2);
		z = x + y;
		z = Math.sqrt(z);
		
		System.out.println("The distance between the two points is " + z);
	}
}