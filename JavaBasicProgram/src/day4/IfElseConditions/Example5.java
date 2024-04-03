package day4.IfElseConditions;

public class Example5 {

	public static void main(String[] args) {
		int num = 6;
		if (num/num% == 0) {
			if (num % num == 0) {
				System.out.println("Given no is prime no " + num);
			} else {
				System.out.println(" Givne no is not prime no " + num);
			}
		}
	}
}
// Gvine no is prime or not 