
public class TotalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle_8[] circleArray;
		
		circleArray = createCircleArray();
		
		printCircleArray(circleArray);
	}
	
	public static Circle_8[] createCircleArray() {
      Circle_8[] circleArray = new Circle_8[5];
      for (int i= 0; i < circleArray.length; i++) {
    	  circleArray[i] = new Circle_8(Math.random() * 100);
      }
      return circleArray;
      
	}
	
	public static void printCircleArray(Circle_8[] circleArray) {
	  System.out.printf("%-30s&-15s\n", "Radius","Area");
	  for (int i = 0;i < circleArray.length; i++) {
		  System.out.printf("%-30f%-15\n", circleArray[i].getRadius(),
				  circleArray[i].getArea());
	  }
	  
	  System.out.println("_____________________________");
	  
	  System.out.printf("%-30s%-15f\n", "The total area od circle is ",sum(circleArray));
	
	}
	
	public static double sum(Circle_8[] circleArray) {
		double sum = 0;
		for (int i = 0;i < circleArray.length; i++)
			sum += circleArray[i].getArea();
	    return sum;
	  
	}
	
}
