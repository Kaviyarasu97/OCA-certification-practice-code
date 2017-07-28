package example3;

public class Main2{
    public static void main(String[] args) { 
      Shape rectangle = new Rectangle1(5);  // A
      System.out.println(","+rectangle.hasEdges()); // B
    } 
}

class Shape { 
    public Shape() { 
      System.out.print("Shape"); 
    } 
    public Shape(int edge) { 
      System.out.print("ShapeEdge"); 
    } 
   boolean hasEdges() { 
      return false; 
    } 
} 
class Rectangle1 extends Shape { 
 public Rectangle1(int age) { 
   System.out.print("Rectangle"); 
 } 
 public boolean hasEdges() { // C
   return true; 
 } 
}  
