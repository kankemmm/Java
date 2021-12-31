import java.util.Scanner;
public class Text3_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012):");
		double year = input.nextDouble();
		System.out.println("Enter month: 1-12 ");
		double month = input.nextDouble();
		System.out.println("Enter the day of the month: ");
		double days = input.nextDouble();
		double h, q , m , k , j ;
		q = days;
		k = year % 100;
		j = year / 100;
		if(month == 1 || month == 2 ) {
			month += 12 ;
			k -= 1;//世纪年份要计算为上一年的；
			
		}
		
		h = (q + (int)((26*(month + 1 ) ) / 10) + k + (int)k/4 + (int)j/4 + 5 * j ) % 7;
		System.out.println((int)h);

	}

}
