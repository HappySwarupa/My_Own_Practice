import java.util.*;
public class Employee {
    int id;
    String Name;
    int Salary;
	Employee(int id,String Name,int Salary){
		this.id= id;
		this.Name= Name;
		this.Salary= Salary;
	}
	void displayDetails(){
 System.out.println("EMP NAME:"+Name+"EMP ID:"+id+"Salary:"+Salary);
	}
	public static void main(String args[])
	{
	  Employee obj1= new Employee(101,"Swarupa",40000);
	  Employee obj2= new Employee(102,"Nilanjana",50000);
	  Employee obj3= new Employee(103,"Rajashree",60000);
	  Employee obj4= new Employee(104,"Aranyak",70000);
	  Employee obj5= new Employee(105,"Subhadip",80000);
	
	  obj1.displayDetails();
	  obj2.displayDetails();
	  obj3.displayDetails();
	  obj4.displayDetails();
	  obj5.displayDetails();
	  
	  
	  
	}

}
