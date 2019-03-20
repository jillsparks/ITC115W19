public class EmployeeMain{
public static void main(String[] args) {
        Employee[] e = { new Lawyer(),   new Secretary(), 
                         new Marketer(), new LegalSecretary(),
                         new HarvardLawyer(), new Janitor()};
        

        for (int i = 0; i < e.length; i++) {
        	
        	System.out.println(e[i].getSalary());
        	System.out.println(e[i].getVacationDays());
           
            System.out.println();
        }
        
        Janitor j = new Janitor();
        j.clean();
    }
}
