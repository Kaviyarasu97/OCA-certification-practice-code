package example;

import java.time.LocalDate;
import java.util.Scanner;

class FinallyTest{

public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		if(((a/2)*2)==a){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
}
}