package example3;

import java.util.*; 
public class Rectangle { 
  public Rectangle(String n) { 
     name = n; 
  } 
  public static void main(String[] args) { 
    Rectangle one = new Rectangle("g1"); 
    System.out.println("one object"+one);
    Rectangle two = new Rectangle("g2");
    System.out.println("two object"+two);
    one = two; 
    System.out.println("after assign"+one);
    System.out.println("check two"+two);
   two = null; 
   System.out.println("two null assign"+two);
   System.out.println(one);
  // one = null; 
   System.out.println(two);
   System.out.println("one null assign"+one);
 } 
   private String name; 
}
