/*See the example programme for Java array sorting below.
 *  Write the same programme to sort the integers 8, 4, 3,5,6 and 
 *  the alphabetical string C, O, I, P, U, in ascending order */

package corejava;
import java.util.Arrays;
public class JavaArraySort {
	
	public static void main(String args[])
	{
		int[]a1= {8,4,3,5,6};
		String[]a2= {"C","0","I","P","U"};
		Arrays.sort(a1);
		Arrays.sort(a2);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
	}

}
