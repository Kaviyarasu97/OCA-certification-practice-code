package example;

class A{
	   int i;
	   public A(int x) { this.i = x; 
	   System.out.println(i);}
}
	class B extends A{
	   int j;
	   
	  public B(int x,int y) {
		  super(y); 
	  this.j = y; 
	   }
	 /// B(int y ) { this(y, y); }
	 // B( ) { }
	///  B(int y ) { super(y*2 ); j = y; }
	  ///B(int y ) {
		//	super(y*2); i = y; j = y*2; System.out.println("its calling");
		//}
	 // B(int y ) { j = y; }
	  }
	
	//B(int y ) { this(y, y); }
	//B( ) { }
	//B(int y ) { super(y*2 ); j = y; }
	//B(int y ) {
		//super(y*2); i = y; j = y*2; System.out.println("its calling");
	//}
	//B(int y ) { j = y; }
		
	
