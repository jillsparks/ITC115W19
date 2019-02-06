import java.util.*;
public class Ch5Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomWalk();

	}
	public static void randomWalk() {
		int position = 0;
		int maxPosition = 0;
		
		Random randomWalk = new Random();
		
		System.out.println("position = " + position);
		
		while (position <3 && position >-3) {
			int step = randomWalk.nextInt(2);
			if (step == 0)
			{
				position++;
			}else 
				{position--;}
			
			maxPosition = Math.max(position, maxPosition);
 
	System.out.println("position = " +position);
		}
	System.out.println("Max position = " + maxPosition);

	

	
	}

}



