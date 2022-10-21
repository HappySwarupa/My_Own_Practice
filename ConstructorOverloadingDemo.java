import java.util.*;
public class ConstructorOverloadingDemo{

int id;
String name;
int age;

 ConstructorOverloadingDemo(int a,String b)
{
  this.id= a;
  this.name=b;
}
 ConstructorOverloadingDemo(int a,String b,int c) 
{
   this.id= a;
   this.name= b;
   this.age= c;
   
 
}
  void display()
{
   System.out.println("Id:"+id+"Name:"+name+"Age:"+age);

}

public static void main(String args[])
{
   ConstructorOverloadingDemo c1= new ConstructorOverloadingDemo(224, "Swarupa",23);
   ConstructorOverloadingDemo c2= new ConstructorOverloadingDemo(225, "Nilanjana",22);
   ConstructorOverloadingDemo c3= new ConstructorOverloadingDemo(226, "Rajashree",22);
   ConstructorOverloadingDemo c4= new ConstructorOverloadingDemo(227, "Aranyak",22);
   c1.display();
   c2.display();
   c3.display();
   c4.display();


}

     }