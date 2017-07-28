package example5;

public class Main4 { 
    public static void main(String args[]) { 
        Main var = new Main(); 
        var.print(args); 
    } 
    void print(String[] arr) { 
        try { 
            System.out.println(arr[0] + ":" + arr[1]); 
        } 
        catch (NullPointerException e) { 
            System.out.println("NullPointerException"); 
        } 
        catch (IndexOutOfBoundsException e) { 
            System.out.println("IndexOutOfBoundsException"); 
        } 
        catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("ArrayIndexOutOfBoundsException"); 
        } 
    } 
} 
