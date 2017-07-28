package example1;
import java.util.ArrayList;
public class Student {
	
	public static void main(String[] args) {
		Student s=new Student();
		s.getAverage();
		s.computeAverage();
	System.out.println("methods");
	}
	    ArrayList<Integer> scores;
	    private double average;
	
	    public ArrayList<Integer> getScores(){ 
	    	System.out.println("Array list block");
	    	return scores; }
	    
	    public double getAverage(){
	    	System.out.println("getAverage block");
	    	return average; }
	    
	    public void computeAverage(){
	        //valid code to compute average
	    	System.out.println("computer average");
	        average =(getAverage());//update average value
	    }
	    public Student(){
	        computeAverage();
	        getAverage();
	    }
	}


