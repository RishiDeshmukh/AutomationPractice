package day4.IfElseConditions;

public class Example6 {

	public static void main(String[] args) {
		// to find the biggest no among these no's
		int num1 = 40, num2 = 20, num3 = 30;
		if (num1 > num2 && num1 > num3) {
			System.out.println("This no is biggest " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("This no is biggest" + num2);
		} else {
			System.out.println("This no is biggest " + num3);
		}
	}
}
// which number is biggest among the given 