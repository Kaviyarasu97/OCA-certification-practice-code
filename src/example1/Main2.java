package example1;

public class Main2 {
	  public static void main(String args[]) {
	    int num = 0;

	    switch (num) {
	    default:
	      System.out.println("default");
	    case 1:
	      System.out.println("case1");
	    case 10 * 2 - 20:
	      System.out.println("case2");
	      break;
	    }
	  }
	}