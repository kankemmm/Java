import java.util.Scanner;
public class text3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a point's x and y :");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble(), y = input.nextDouble();
		double a = (200 - x ) / 200 * 100;
		double b = (100 - y ) / 100 * 200;
		
		System.out.println(x <= b && y <= a
				? "The point is in the triangle!"
				: "The point is not in the triangle!");

	}

}
