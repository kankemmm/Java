import java.util.Scanner;
public class Text3_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble(), y = input.nextDouble();
		if (x <= 5 || x <= -5 && y <= 2.5 || y <= -2.5) {
			System.out.println("The point " + x + "," + y + " is in the rectangle");
		}
		else System.out.println("The point is not in the rectangle");
	}

}
