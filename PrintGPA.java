import java.util.Scanner;
public class PrintGPA {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		printGPA(console);
	
	}
	public static void printGPA(Scanner console) {
		//declare variables
		double total = 0;
		String name;
		int numScores;
		
		System.out.print("Enter a student record: ");
		name = console.next();
		numScores = console.nextInt();
		
		for(int i = 1; i <= numScores; i++) {
			total += console.nextDouble();
		
		}
		double average = total/numScores;
		System.out.printf("%s's grade is %.2f ", name, average);
				
	}
	
	

}
