package example3;

public class Main { 
       public static void main(String[] args) { 
         int i = 10; 
         if((i>10 ? i++: --i)<10) { 
           System.out.print("Foo"); 
         }
         if(i<10) System.out.print("Bar"); 
         System.out.println(i);
       } 
    }
