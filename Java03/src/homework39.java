import java.util.Scanner;
public class homework39 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the First 9 digits of an ISBN as interger£º");
		int d = input.nextInt();
		
		int d9 = d % 10;
		int d8 = d / 10 % 10;
	    int d7 = d / 100 % 10;
	    int d6 = d / 1000 % 10;
	    int d5 = d / 10000 % 10;
	    int d4 = d / 100000 % 10;
	    int d3 = d / 1000000 % 10;
	    int d2 = d / 10000000 % 10;
	    
	    int d1 = d % 100000000;
	    
		int d10 =(int)((d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11);
		
		  if(d10 == 10)
	            System.out.println("The ISBN-10 number is " +d+"X");
	        else
	            System.out.println("The ISBN-10 number is " +d+d10);
	}

}