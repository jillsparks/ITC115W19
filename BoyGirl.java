
import java.io.*; //for File
import java.util.*; //for Scanner

public class BoyGirl {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner (new File("boysgirls.txt"));
		
		boyGirl(input);
					
	}
	public static void boyGirl(Scanner input) {
		int boyCount = 0;
		int boySum = 0;
		int girlCount = 0;
		int girlSum = 0;
		int lineCount = 0;
		//input is the variable of the Scanner object
		while (input.hasNext()) {
			String name = input.next();
			if (lineCount % 2 ==0) {
				boyCount++;
				boySum += input.nextInt();
			}
			else {
				girlCount++;
				girlSum += input.nextInt();
			}
		lineCount++;
	}
	
	System.out.println(+boyCount+ " boys, " +girlCount+ " girls");
	System.out.println("Difference between boys' and girls' sums: " +Math.abs(boySum-girlSum));
	

}
}