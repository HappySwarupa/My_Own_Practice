/*Let us consider a child class named Girl and a parent class named Human. 
 * The Human class is extendedbytheGirl
 * class. Both the parent and child classes have a common 
 * method called void walk(). The Girl class is overridingthewalk() method in this example. 
 * As the Girl class overrides the method, the output will show a result for it.*/
package com.example;
import java.util.*;
class Human {
	
	void walk() {
		System.out.println(" human walking");
	}

}
class Child extends Human{
	
	void walk(){
		
		System.out.println("Girl is walking");
		
	}
}
public class OverridingDemo{
	public static void main(String args[])
	{
		Child c1= new Child();
		Human h1= new Human();
		c1.walk();
		h1.walk();
	
	}
}
