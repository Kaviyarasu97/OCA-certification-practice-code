package example4;

  class Main6 {

void add(){
	System.out.println("add method");
}

}
 public class Main5 extends Main6{
	void add(){
		System.out.println("Add method in main 5");
	}
	public static void main(String[] args) {
		Main5 ob=new Main5();
		//main5 ob=new main5();
		ob.add();
	}
}

