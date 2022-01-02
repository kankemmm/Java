import java.util.Date;
public class Test9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Date days = new Date();
		   for(int i =1;i<=8;i++) {
			   long time = 1000 * (long)Math.pow(10, i);
			days.setTime(time);
			System.out.println(days.toString());
		}
		
		

	}

}
