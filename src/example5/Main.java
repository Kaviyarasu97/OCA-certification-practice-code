package example5;

public class Main { 
      public static void Main(String[] args) { 
        int x = 5, j = 0; 
        for(int i=0; i<3; )
        	//System.out.println(i);
          INNER: do { 
            i++; x++; 
            System.out.println("i value is"+i);
            System.out.println("x value is"+x);
            if(x > 10) break INNER; //x=6 condition gets false
            x += 4;//it print 10
            System.out.println("within loop x values"+ x);
           j++; 
           System.out.println("j valuesn is" +  j);
          } while(j <= 2); 
        System.out.println(x); 
     }

	public void print() {
		// TODO Auto-generated method stub
		
	} 
    } 
