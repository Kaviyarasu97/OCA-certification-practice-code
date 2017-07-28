package example2;

public class SwitchSample {
//	public class SwitchSample {
		public static void main(String[] args) {
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
		for (char x = 'a'; x <= 'c'; x++) {
		if (a == 3 || x == 'd')
		continue FIRST_CHAR_LOOP;
		System.out.print(" " + a + x);
		}
		}
		}
		}


