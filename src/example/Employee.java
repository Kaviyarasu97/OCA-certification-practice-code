package example;

import java.util.Scanner;
//how to create  a object for multiple user
public class Employee{
	 int id;
	 String name;
	 Employee(int id,String name){
		 this.id=id;
		 this.name=name;
		System.out.println(name+","+id);
	 }
	 public static void main(String[] args) {
		Employee[] emp=new Employee[5];
		Scanner em=new Scanner(System.in);
		System.out.println("enter id and name");
		for(int i=0;i<=5;i++){
		int x=em.nextInt();
		String y=em.next();
		emp[i]=new Employee(x,y);
		
	}
 }
}