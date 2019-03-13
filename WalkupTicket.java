//WalkupTicket is an extension of the Ticket superclass
public class WalkupTicket extends Ticket {
	
	public WalkupTicket(int number) {
		//invoke the constructor of the superclass by using super keyword, 
		//it's number because we used number from constructor of superclass
		super(number);
	}

	@Override
	public double getPrice() {
		//added via clicking on error that shows constructor is missing		
		return 50.00;
	}

}
