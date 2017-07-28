package example;
//java TestClass 1 2 3
//import java.util.Scanner;
class Test{
	   public Test() { }
	   public Test(int i) {   System.out.println(i );    }
	}
	class B{
	   static Test s1 = new Test(1);
	   Test a = new Test(2);
	   public static void main(String[] args){
	      B b = new B();
	      Test a = new Test(3);
	   }
	   static Test s2 = new Test(4);
	}
	




