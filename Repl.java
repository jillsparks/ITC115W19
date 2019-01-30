import java.util.Scanner;
public class Repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare variables
		String phrase, output;
		int times;

		//construct Scanner
		Scanner console = new Scanner(System.in);
		
		//get user input using next method for string
		System.out.println("Enter a string: ");
		phrase = console.nextLine();
		//get user input using next method for number of times
		System.out.println("Enter number of times: ");
		times = console.nextInt();
		
		//parameters are the phrase and times
		output=repl(phrase,times);
		
		//display output
		System.out.println(""+output+ "");
	}
	public static String repl(String phrase, int times) {
		String newStr = "";
		//if 0 times, return nothing
		if (times<=0)
			return newStr;
		else {
			for (int i=1; i<=times;i++)
				newStr=newStr + phrase;
			return newStr;
		}
	}
}
