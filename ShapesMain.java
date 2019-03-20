
public class ShapesMain {

	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Rectangle(18,18);
		s[1] = new Triangle(30, 30, 30);
		s[2] = new Rectangle(7,5);
		
		//display are in perimeter using a for loop
		for(int i = 0; i < s.length; i++) {
			System.out.println("area = " +s[i].getArea()+ " perimeter = " +s[i].getPerimeter());
		}

	}

}
