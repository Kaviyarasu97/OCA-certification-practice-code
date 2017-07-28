package example4;

class Base {
	 String var = "Main";

	  void printVar() {
	    System.out.println(var);
	  }
	}

	class Derived extends Base {
	  String var = "AAA";
//
//	  void printVar() {
//	    System.out.println(var);
//	  }
//	}
//
//	class Main4 {
//	  public static void main(String[] args) {
//	    Base base = new Base();
//	    Base derived = new Derived();

	    System.out.println(base.var);
	    System.out.println(derived.var);
	    base.printVar();
	  //  derived.printVar();
	  }
	}
