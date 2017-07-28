package ConnectionUtil;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


class Solution{
	 public void display() {
//		Solution n=new Solution();
			
		Scanner s=new Scanner(System.in);
		/*Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from courses");  
		while(rs.next()){
			int Id = rs.getInt("Id");
	        String Name = rs.getString("Name");
	        int Duration= rs.getInt("Duration (Hrs)");
	        String Active = rs.getString("Active");
	        String content = rs.getString("content");
	       int ch;
	       Scanner sn=new Scanner(System.in);
	       
	        System.out.format("%s,%s,%s,%s,%s\n", Id,   Name,        Duration,        Active,         content);	
		//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); */
	        
	        
		System.out.println("1. List all courses\n2.List all active course\n3. List all inactive courses\n4. Edit a course and its contents\n5. Delete a course and its contents\n6. Add a course and its contents\n7. Exit");
		
		 System.out.println("Enter the next action menu (1 to 7):");
		 int option=s.nextInt();
		 switch(option){
		 case 1:System.out.println("ID   Name      Duration (Hrs)   Active    Content");
				System.out.println("---  --------  ---------------  -----    -----------------");
				System.out.println();
			break; 	
		 case 2:System.out.println("ID   Name      Duration (Hrs)   Active    Content");	
		        System.out.println("---  --------  ---------------  -----    -----------------");
		 }
	}
}


