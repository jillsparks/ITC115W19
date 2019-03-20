//janitor class extends Employee class
public class Janitor extends Employee {
	
	public void clean() {
		System.out.println("Workin' for the man.");
	}
	
	public int getHours() {
		return 80;
		
	}

	public double getSalary() {
		return 30000.0;
	}

	public int getVacationDays() {
		return 5;
	}
}


