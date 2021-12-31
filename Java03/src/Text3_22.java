//ÅĞ¶ÏµãÔÚÔ²ÄÚ
import java.util.Scanner;
public class Text3_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		int x = input.nextInt(), y = input.nextInt();
		double radius = Math.sqrt(x * x + y * y);
		if (radius <= 10) {
			System.out.println("The point  is in the circle");
		}
		else System.out.println("The point is not in the circle");
		
	}

}
