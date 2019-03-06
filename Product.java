import java.text.NumberFormat;

public class Product{
		//declare fields(the data stored in each object). Type followed by name and semicolon
		//fields declared directly inside a class
	    private int productCode;
	    private String productDescription;
	    private double productPrice;
	    private int productCount;
	   
	    public Product(){     
	            }
	    //constructor initializes new objects as they are created
	    //constructor executes when the client uses the new keyword to create an object
	    //constructor will have same name as class
	    public Product(int productCode, String productDescription, double       
	                             productPrice, int productCount)
	           {
	         this.productCode = productCode;
	         this.productDescription = productDescription;
	         this.productPrice = productPrice;
	         this.productCount = productCount;
	           }
	    
	     //getters and setters
	    //accessor methods
	    public int getProductCode() {
					return productCode;
				}

				public void setProductCode(int productCode) {
					this.productCode = productCode;
				}

				public String getProductDescription() {
					return productDescription;
				}

				public void setProductDescription(String productDescription) {
					this.productDescription = productDescription;
				}

				public double getProductPrice() {
					return productPrice;
				}

				public void setProductPrice(double productPrice) {
					this.productPrice = productPrice;
				}

				public int getProductCount() {
					return productCount;
				}

				public void setProductCount(int productCount) {
					this.productCount = productCount;
				}
				
				public String getPriceFormatted() 
				    {
				       String formattedPrice = NumberFormat.getCurrencyInstance().format(this.productPrice);
				       return formattedPrice;
				    }
				
		//toString method is an instance method that returns string representation of the object
		//toString method has a String return type
		public String toString() {
	        return "Price= " + getPriceFormatted() + ", Description= "
	                + productDescription + ", Product Code= " + productCode
	                + ", Product Count= " + productCount;
	    }
	}


