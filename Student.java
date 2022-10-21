import java.util.*;
public class Student {
	
		int ID;
		String Name;
		int Age;
		
		Student(int a,String b, int c)
		{
			ID= a;
			Name= b;
			Age=c;
		}
		 void display()
		{
			System.out.println("NAME:"+Name+"ID:"+ID+"Age:"+Age);
		}
		public static void main(String args[])
		{
			Student s1= new Student("Ram",224,23);
			Student s2= new Student("Ratan",225,24);
			s1.display();
			s2.display();
			
		}
		
	}


