
public class Rectangle implements Shape {
	
	private  double width;
	private double height;
	
	public  Rectangle(double width, double height) {
		this.width = width;
		this.height =  height;
	}

	//added unimplemented methods by clicking on erro
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width * height);
	}

}
