package testPackage;


public class TestShapes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Rectangle rectangleRef = new Rectangle(2.2f, 3.3f);
		rectangleRef.start();
		Circle circleRef = new Circle(3.3f);
		Thread threadRef = new Thread(circleRef);
		threadRef.start();
		

	}

}
