package day4.IfElseConditions;

public class Exampler2 {

	public static void main(String[] args) {
		int age = 19;
		char BloodGroup = 'a';
		if (age > 18) {
			if (BloodGroup == 'o') {
				System.out.println("you can donate blood ");
			} else {
				System.out.println("you can not donate blood due to bloodgroup " + BloodGroup);
			}
		} else {
			System.out.println("you can not donate blood due to age " +age );
		}
	}

}
// eligable for blood donation or not 