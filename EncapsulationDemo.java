package com.example;
import java.util.*;
class Test {
private String Adhar;
private String empName;
private int empAge;

public String getEmpAdhar() {
	
	return Adhar;
}
public String getEmpName() {
	
	return empName;
}

public int getEmpAge() {
	
	return empAge;
}

public void setEmpAdhar(String newvalue)
{
	Adhar= newvalue;
}
public void setEmpName(String newvalue) {
	
	empName= newvalue;
	
}
public void setEmpAge(int newvalue)
{
	
  empAge= newvalue;
	
}

}

public class EncapsulationDemo{
	
	public static void main(String args[])
	{
	Test obj1= new Test();
	obj1.setEmpAdhar("8999 5989 9948");
	obj1.setEmpName("SWARUPA DEY");
	obj1.setEmpAge(23);
	System.out.println("Enter the Employee AdharID"+obj1.getEmpAdhar());
	System.out.println("Enter the Employee Name"+obj1.getEmpName());
	System.out.println("Enter the Employee Age"+obj1.getEmpAge());
		
		
	}
}
