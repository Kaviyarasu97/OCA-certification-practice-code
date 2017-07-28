package example4;
import java.util.Scanner;

public class Gcd {
	public static int i=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any three values:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		Gcd l=new Gcd();
		l.Lcf(a,b,c);
		l.Lcm(a,b,c);
		int res = 0;
		for(i=2;i<=c;i++){
			if((a%i==0)&&(b%i==0)&&(c%i==0)){
				res=i;			
			}
		}
		System.out.println("Gcf is:"+res);
	}
	public static void Lcf(int x,int y,int z){
		int r=0;
		for(i=2;i<=z;i++){
			if((x%i==0)&&(y%i==0)&&(z%i==0)){
				r=i;		
				break;
			}
		}
		System.out.println("lcf is:"+r);	
	}
	public static void Lcm(int n1,int n2,int n3){
		int lcm;
         lcm = (n1 > n2) ? (n2>n3)?n1 : n2 : n3;
         // System.out.println(lcm); 
         while(true)
        {
        	// System.out.println(lcm);
            if( lcm % n1 == 0 && lcm % n2 == 0 && lcm % n3 == 0 )
            {
                System.out.println("The LCM :"+ lcm);
                break;
            }
            ++lcm;
        }
	}
}
