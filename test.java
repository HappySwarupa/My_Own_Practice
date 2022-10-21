package com.example;
import java.util.*;
public interface In {
	
	
	final int c=9;
	void display();

}
 public class test implements In{
     public void display(){
         System.out.println("girl");
     }
	 public static void main(String args[]){
	 test t= new test();
	 t.display();
	 System.out.println(c);
	 }
		
}
