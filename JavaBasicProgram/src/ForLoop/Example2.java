package ForLoop;

public class Example2 {

	public static void main(String[] args) {
		char ch = 'a';
		int num = ch;
		System.out.println("char " + ch);
		System.out.println("num " + num);

		System.out.println("Print a to z *****************************");

		for (char cr = 'a'; cr <= 'z'; cr++) {
			System.out.println(cr);
		}
			System.out.println("*************print Z to A********************");
			for (char cp = 'z'; cp >= 'a'; cp--) {
				System.out.println(cp);
			
		}

	}
}
