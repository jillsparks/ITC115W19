
public class TicketMain {

	public static void main(String[] args) {
		//create a ticket, must pass a number for unique ticket number
		//Ticket t = new Ticket(100);//cannot instantiate an abstract class
		
		//test WalkupTicket to see if it works
		//create a WalkupTicket, add arguments to pass WalkupTicket
		//WalkupTicket wt1 = new WalkupTicket(101);
		
		Ticket wt1 = new WalkupTicket(101);//is a polymorphism relationship
		
		//get wt1 price
		//need to call methods of the class
		System.out.println(wt1.getPrice());
		//called toString from the superclass
		System.out.println(wt1.toString());
		
		Ticket[] t = {
				new WalkupTicket(102), // index 0 in array 
				new AdvancedTicket(103,15), //index 1 in array
				new AdvancedTicket(104, 7), // index 2 in array
				new WalkupTicket(105), //index 3 in array
				new AdvancedTicket(106,42), //index 4 in array
				new StudentAdvanceTicket(107, 12), //index 5 in array
				new StudentAdvanceTicket(108, 5), //index 6 in array
				};
		//length is checking how many things are in the array
		for(int i = 0; i < t.length; i++) {
			System.out.println(t[i].toString());
		}
	}

}
