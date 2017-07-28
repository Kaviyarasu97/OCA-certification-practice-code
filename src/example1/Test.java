package example1;

interface Printable { 
    void print(); 
} 
class Square implements Printable { 
    public void print() { 
       System.out.println("Square print"); 
    } 
} 
class Rectangle implements Printable { 
    public void print() { 
       System.out.println("Rectangle print"); 
    } 
} 
public class Test { 
    // INSERT CODE HERE
	void walk(Printable movable){
        movable.print(); 
    } 
	public static void main(String[] args) {
		Test t=new Test();
		Printable movable;
		t.walk(movable);
	}
} 