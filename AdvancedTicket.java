//AdvancedTicket can reuse code from Ticket, it's an extension of Ticket
public class AdvancedTicket extends Ticket{
	//need to make a field for daysInAdvance
	private int daysInAdvance;

	// double click error to have this entered 
	//we added daysInAdvance variable first, next add it to field above
	public AdvancedTicket(int number, int daysInAdvance) {
		super(number);
		this.daysInAdvance = daysInAdvance;
		
	}
	//@Override implements a new version of a method to replace code that would have been
	//inherited by a superclass
	@Override
	public double getPrice() {
		//double click error to implement getPrice()
		if(daysInAdvance >=10)
			return 30.00;
		else
			return 40.00;
		
	
	}

}
