package example3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3{
	  public static void main(String[] argv){
	     int[] array = {6,9,8}; 
	    
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter values to be set");
	     int i=s.nextInt();
	     List<Integer> list = new ArrayList<>(); 
	     list.add(array[0]);//6 
	    // list.add(array[1]);
	     list.add(array[2]);//8
	     try{
	     list.set(i, array[1]); //9
	     }catch(Exception e){
	    	 System.out.println("please check your index value ");
	     }
	    list.remove(0); //6
	     System.out.println(list); 
	  }
	}
