package ConnectionUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.Scanner;

public class Database {
	public static void main(String args[]){ 
		Solution s=new Solution();
		s.display();
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/course","root","root");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from courses");  
		while(rs.next()){
			int Id = rs.getInt("Id");
	        String Name = rs.getString("Name");
	        int Duration= rs.getInt("Duration (Hrs)");
	        String Active = rs.getString("Active");
	        String content = rs.getString("content");
	      // int ch;
	       //Scanner sn=new Scanner(System.in);
	       
	        System.out.format("%s,%s,%s,%s,%s\n", Id,   Name,Duration,Active,content);	
		//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
	        
	        
	        }
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
		} 