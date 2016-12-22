package testPackage;

public class Rectangle extends Thread implements TestInterface {
	float sidea;
	float sideb;
	float area;
	float perimeter;
	public void run(){
		area();
		perimeter();
	}

	public Rectangle(float sidea, float sideb) {
		super();
		this.sidea = sidea;
		this.sideb = sideb;
	}

	public void area() {
		for (int i = 0; i < 5; i++) {
			area=sidea*sideb;
			System.out.println("Rectangle Area is: in iteration"+i+"is "+area);
		}
	}

	public void perimeter() {
		perimeter=2*(sidea+sideb);
		System.out.println("The perimeter is "+perimeter);

	}

}
