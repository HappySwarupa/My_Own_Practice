//Example of inheritance
package com.example;
import java.util.*;
class Employee1 {
	int ID=101;
	int Salary=50000;
}
 public class Programmer extends Employee1{
	int ID=205;
   int Bonus=10000;
	public static void main(String args[])
	{
		Programmer p= new Programmer();
		System.out.println("Programmer ID:" +p.ID);
		System.out.println("Programmer Salary:" +p.Salary);
		System.out.println("Programmer Bonus:"+p.Bonus);
		
	}
}