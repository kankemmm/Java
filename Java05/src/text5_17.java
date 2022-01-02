import java.util.Scanner;
public class text5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines :");
		int n = input.nextInt();
		for(int i = 1; i <=n ; i++) {

			for(int c=1;c<=n-i;c++)
				System.out.print("   ");
			
			for(int num =i;num>=1;num--)
				 System.out.print((num >= 10) ? " " + num : "  " + num);

            for (int num = 2; num <= i; num++)
               System.out.print((num >= 10) ? " " + num : "  " + num);
            System.out.println();

		}
			
		}
	}

