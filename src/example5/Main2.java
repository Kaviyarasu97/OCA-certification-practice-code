package example5;

public class Main2 {
	{System.out.println("up");}
	Main2(){
	 System.out.println("constructor");
	 }
	{System.out.println("main up");}
	static{
		System.out.println("static");
	}
	public static void Main(String[] args) {
		
		
		Main2 ob=new Main2();
		System.out.println("hiii kavi");
		{
			System.out.println("hiii kavi");
		}
		
	}
 
}
