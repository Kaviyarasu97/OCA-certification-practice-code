package example;

import java.io.IOException;

class prof {
	//class Teacher{
	      void teach(String student){
	          /* lots of code */
	      }
	}
	class Teacher extends prof{
	        //1
		 Teacher(String s,int a){
			 System.out.println("it called");
			
		}
		public static void main(String[] args)throws IOException {
			Teacher ob=new Teacher(null, 0);
			ob.teach(10);
			}
	}

