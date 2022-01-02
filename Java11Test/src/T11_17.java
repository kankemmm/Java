import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T11_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m : ");
		int m = input.nextInt();
		int n = findn(m);
		System.out.println("The smallest number n for m*n to be a perfect sqare is£º  " + n );
		System.out.println("m * n is "+ m * n);
	}
	
	public static int findn(int m ) {
		ArrayList<Integer> list = new ArrayList<>();
		int temp = m;
		while (temp != 1) {
			for(int i = 2;i<=temp;i++) {
				if(temp % i == 0) {
					temp /=i;
					list.add(i);
					break;
				}
			}
		}
		int max = Collections.max(list);
		int [] count = new int[max + 1];
		for (int number :list) {
			count[number]++;
			}
		
		int n = 1;
		for (int i = 0;i < max +1 ; i++) {
			if(count[i] % 2 == 1) {
				n *= i;
			}
		}
		return n;
	}

}
