
public class PolymorphismDemo {

	public static void main(String[] args) {
		displayObject(new Circle(1, "red", false));
		displayObject(new Rectangle(1, 1, "black", true));
		// TODO Auto-generated method stub
	}
	public static void displayObject(GeometricObject object) {
		System.out.println("Createn on " + object.getDateCreated() + ". Color is "
				+ object.getColor());
		
	}

}
