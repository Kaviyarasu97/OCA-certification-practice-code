package example1;

public class Main1 { 
    public static int getVal() { 
        return 100; 
    } 
    public static void main(String args[]) { 
        int num = 10; 
        final int num2 = 20; 
        switch (num) { 
        case 10: System.out.println("2");
            // INSERT CODE HERE 
                  break; 
       // case 10/3: System.out.println(4);
       // case num2: System.out.println(5);          
            default: System.out.println("default"); 
        } 
    } 
} 
