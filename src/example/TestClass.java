package example;

//public class TestClass {
	import javax.swing.JFrame;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.SwingUtilities;
	public class TestClass extends JFrame
	{
	    public TestClass()
	    {
	    	
	        //headers for the table
	        String[] columns = new String[] {
	            "Id", "Name"," Duration (Hrs)"," Active" ,"Content"

	        };
	         
	        //actual data for the table in a 2d array
	        Object[][] data = new Object[][] {
	            {1," Java" ,3," Yes"," Introduction to Java (Video) Java Intro Assessment (Assessment)"
 },
	            {2, "Basic SQL", 0.5," No" ,"Basic SQL Statements (Video) SQL Statements (Assessment) Joins (Video) SQL Joins (Assessment)" },
	           
	        };
	        //create table with data
	        JTable table = new JTable(data, columns);
	         
	        //add the table to the frame
	        this.add(new JScrollPane(table));
	         
	        this.setTitle("Table Example");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
	        this.pack();
	        this.setVisible(true);
	    }
	     
	    public static void main(String[] args)
	    {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new TestClass();
	            }
	        });
	    }   
	}


	
	
