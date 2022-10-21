package com.example;
import java.util.*;
 class Animal {
	 void Eat() {
		 System.out.println("The Animal Eating a piece of chicken");
	 }
}
 class Dog extends Animal{
	 void bark() {
		 System.out.println("The Dog was barking ");	 
	 }
	 
 }
 public class Testing{
	 public static void main(String args[])
	 {
		 Dog d= new Dog();
		 d.Eat();
		 d.bark();
		 
	 }
 }