package testPackage;

class Circle implements TestInterface,Runnable {
	
	float radius;
	float area;
	float perimeter;

	public Circle(float radius) {
		this.radius = radius;
	}
	public void run()
	{
		area();
		perimeter();
	}
	
	public void area() {
		for(int i=1;i<=5;i++){
			area=testPackage.TestInterface.MYPI*radius*radius;
		System.out.println("Circle Area in iteration "+ i +"  is"+area);
		}
	}
	public void perimeter() {
		perimeter=testPackage.TestInterface.MYPI*radius;
		System.out.println("The perimeter of the circle is"+perimeter);
		
	}
	


}

