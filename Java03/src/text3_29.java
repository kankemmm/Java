
public class text3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         java.util.Scanner input = new java.util.Scanner(System.in);
    	 
    	 System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
    	 double x1 =input.nextDouble();
    	 double y1 =input.nextDouble();
    	 double r1 =input.nextDouble();
    	 
    	 
    	 System.out.println("Enter circle2's center x-, y-coordinates, and radius:");
    	 double x2 =input.nextDouble();
    	 double y2 =input.nextDouble();
    	 double r2 =input.nextDouble();
    	 //两点之间距离公式
    	 double distance =  Math.pow(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2),0.5);
    	 
    	 if(distance <= Math.abs(r1-r2))//内部相切
    		 System.out.println("circle2 is inside circle1");
    	 else if(distance <= r1+r2)//外部相切
    		 System.out.println("circle2 overlaps circle1");
    	 else
    		 System.out.println("circle2 does not overlap circle1");
	}

}
