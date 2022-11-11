/*See the example programme for Java method overloading below. Write the same programme
 *  by assigningvaluesto integers c, d and f and 
 * add them using overloading. Show the resulting output.
 */
package com.example;
import java.util.*;
class Add {
	
	static int add(int c,int d) {
		
		return c+d;
	}

}
class sum{
	
	static int add(int c,int d,int f) {
		
		return c+d+f;
	}
	
}
public class OverridingDemo1{
	
	public static void main(String args[]) {
		
		sum s1=new sum();
		int addition=s1.add(5,8,10);
		System.out.println("the result of the addition is:"+addition);
	}
	
}
