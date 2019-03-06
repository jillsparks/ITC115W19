
public class UseProduct {
	public static void main(String[] args) {
		
			//constructor executes on object being created with new keyword
	        Product a = new Product(123, "Shiseido Face Cream", 85.00 , 2);
	        Product b = new Product(111, "Chanel Perfume", 65.00, 5);
	        
	        System.out.println(a.toString());
	        System.out.println(b.toString());
	       
}}