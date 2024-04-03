package day4.IfElseConditions;

public class LeapYear {

	public static void main(String[] args) {
		// to identify leap year
		int yr = 2023;
		if (yr % 4 == 0 && yr % 100 != 0 || yr % 400 == 0) {
			System.out.println("This year is a leap year " + yr);

		} else {
			System.out.println("This is not a leap year " + yr);
		}
	}
}
// to find out given year is leap year or not 