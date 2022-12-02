package corejava;
import java.util.Arrays;
import java.util.Collections;
public class DecendingOrderDemo {
	
	public static void main(String args[])
	{
		Integer[]a1= new Integer[] {12,20,15,80,50,30};
		Arrays.sort(a1,Collections.reverseOrder());
		System.out.println(Arrays.toString(a1));
		
		
		
	}

}
