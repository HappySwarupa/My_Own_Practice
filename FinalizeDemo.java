package corejava;
import java.util.*;
public class FinalizeDemo {
	
	public static void main(String args[]) {
		
		String s1= new String("Swarupa");
		s1= null;
		System.gc();
		System.out.println("-----FINILIZE METHOD COMPLETED------");
		
	}
	public void finilize() {
		
		System.out.println("-------MAIN METHOD OVERRIDDEN------");
		
		
	}

}
