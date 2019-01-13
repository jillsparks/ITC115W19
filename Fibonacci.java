
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables
		int f1=0;
		int f2=1;
		int sum;
		//
		System.out.print("The first " + 12 + " numbers in Fibonacci sequence are: ");	
		
		for (int i=1; i <= 12; i++) {
			
			sum = f1 + f2;
			f1=f2;
			f2=sum;
			

			System.out.print(f1 + " " );
			}
			
		}

	}


