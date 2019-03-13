
public class StudentAdvanceTicket extends AdvancedTicket{
	//need to make a field for daysInAdvance
	private int daysInAdvance;	
	

	public StudentAdvanceTicket(int number, int daysInAdvance) {
		super(number, daysInAdvance);
		this.daysInAdvance = daysInAdvance;
		
	}
	@Override
	public double getPrice() {
		//double click error to implement getPrice()
		if(daysInAdvance >=10)
			return 15.00;
		else
			return 20.00;
		
	}
}
