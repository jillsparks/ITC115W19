//extends Lawyer class
public class HarvardLawyer extends Lawyer {
	
	
	public double getSalary() {
		return super.getSalary() * 1.2;
		
	}
	

	public int getVacationDays() {
		return 18;
	}
	
	public String getVacationForm() {
		return "pinkpinkpinkpink";
	}

}
