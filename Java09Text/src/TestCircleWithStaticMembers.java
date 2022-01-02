
public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Before creating objects");
		System.out.println("The number of Circle object is " +
		  Circle_6.numberOfObjects);
		
		Circle_6 c1 = new Circle_6();

		System.out.println("\nAfte creating c1");
		System.out.println("c1:radius ("+ c1.radius +
				") and number of Circle object (" +
				c1.numberOfObjects + ")");
		
		Circle_6 c2 = new Circle_6(5);
		c1.radius = 9;
		
		System.out.println("\nAfte creating c2 and modifying c1 ");
		System.out.println("c1:radius ("+ c1.radius + ") and number of Circle objects (" 
		   + c1.numberOfObjects + ")");
		System.out.println("c2:radius ("+ c2.radius + ") and number of Circle objects (" 
				   + c2.numberOfObjects + ")");
		
		
	}

}
