// example of multilevel inheritance
package com.example;
import java.util.*;
class Animal2 {
	 void Eat() {
		 System.out.println("The Animal Eating a piece of chicken");
	 }
}
class Dog extends Animal1{
	 void bark() {
		 System.out.println("The Dog was barking ");	 
	 }
	 
}
	class Cat extends Dog{
		void meaw() {
			System.out.println("The cat was carrying");
		}
	}
public class testing{
	public static void main(String args[]){
	    Dog d= new Dog();
		Cat c= new Cat();
		c.meaw();
		d.bark();
		d.Eat();
		
		
	}
}

