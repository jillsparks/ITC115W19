//superclass for all tickets
public abstract class Ticket { //you cannot instantiate abstract classes
	//field
	private int number;
	//constructor
	public Ticket(int number) {
		//set the value of the field to the argument passed to the constructor
		//when creating a new ticket it needs a unique number
		this.number = number;
	}
	
	public abstract double getPrice();//abstract methods do not implement, implemented in subclass
										//therefore, the subclass must implement it
	
	//implement printing the object as a string by overriding toString method of the object class
	//the best practice for printing toString is to override
	//use override if there is an existing library method and you need to alter
	@Override
	public String toString() {
		return "Number: " +number+ ",Price: " +getPrice();
	}

}
