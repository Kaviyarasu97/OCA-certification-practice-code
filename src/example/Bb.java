package example;
		
public class Bb{
	   public void method(Object o){
	      System.out.println("Object Version");
	   }
	  
	   public void method(java.io.IOException s){
	      System.out.println("IOException Version");
	   }
	   public void method(Exception s){
		     System.out.println("java.io.FileNotFoundException Version");
		   }
	   public static void main(String args[]){
	      Bb tc = new Bb();
	      tc.method(null);
	   }
	}