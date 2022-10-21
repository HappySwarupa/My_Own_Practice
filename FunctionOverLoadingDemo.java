import java.util.*;
class FunctionOverLoadingDemo {
	
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public class test{
		
		public static void main(String args[])
		{
			System.out.println(FunctionOverLoadingDemo.add(6,7));
			System.out.println(FunctionOverLoadingDemo.add(6,7,9));
		
			
		}
		
		
	}

}
