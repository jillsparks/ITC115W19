import java.util.*; //for Scanner
import java.util.Arrays; //for Arrays

public class IsSorted {

	public static void main(String[] args) {
		double[] list1 = { 16.1, 12.3, 22.2, 14.4 };
		double[] list2 = { 1.5, 4.3, 7.0, 19.5, 25.1, 46.2 };
		double[] list3 = {1.5};
		
		System.out.println("List 1 is: " +isSorted(list1));
		System.out.println("List 2 is: " +isSorted(list2));
		System.out.println("List 3 is: " +isSorted(list3));

	}


	public static boolean isSorted(double[] arr)
	{  
	    for ( int i = 0; i < arr.length - 1 ; i++ ) {
	        if ( arr[i] > arr[i+1] )
	          return false;
	    }
	    return true;
	}
			
			

}
