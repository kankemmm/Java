import java.util.Scanner;
import java.util.ArrayList;
public class T11_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"what is " + number1 + "+ "+ number2 + "?" );
		int answer = input.nextInt();
		ArrayList<Integer> answerList = new ArrayList<>();
		
		while(number1 + number2 != answer) {
			if (answerList.contains(answer)) {
				System.out.println("You already enter " + answer);
			}
			else answerList.add(answer);
			
			System.out.print("Wrong answer.Try again "
					+ "what is " + number1 + "+"+ number2 + "?" );
			answer = input.nextInt();
		}
		
		System.out.println("You got it!");

	}

}
