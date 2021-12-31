import java.util.Scanner;
public class text3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter r1's center x , y, width, and height:");
		double x1 = input.nextDouble(), y1 = input.nextDouble();
		double width1 = input.nextDouble(),height1 = input.nextDouble();
		System.out.println("Enter r2's center x , y, width, and height:");
		double x2 = input.nextDouble(), y2 = input.nextDouble();
		double width2 = input.nextDouble(),height2 = input.nextDouble();
		double width3 = x2 - x1 , height3 = y2 - y1;
		double xDistance = x1 -x2 >=0 ? x1-x2 : x2-x1;//判断正负or绝对值算法！！！
		double yDistance = y1-y2 >=0? y1-y2 : y2-y1;
		
		 if (xDistance <= (width1 - width2) / 2 && yDistance <= (height1 - height2) / 2)
			 //y的距离也要同时满足！！！
			 System.out.println("r2 is inside r1"); 
		 else if (xDistance <= (width1 + width2) / 2 && yDistance <= (height1 + height2) / 2) 
			 System.out.println("r2 overlaps r1");
		 else System.out.println("r2 does not overlap r1");
	}

}
