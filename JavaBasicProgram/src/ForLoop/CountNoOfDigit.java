package ForLoop;

public class CountNoOfDigit {

	public static void main(String[] args) {
		int ct = 0;
		for (int num = 123; num != 0; num = num / 10) {
			ct++;
		}
		System.out.println(ct);
	}
}
