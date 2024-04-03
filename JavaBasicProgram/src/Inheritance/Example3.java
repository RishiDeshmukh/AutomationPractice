package Inheritance;

class RBI1 {
	RBI1(int num) {
		System.out.println("Welcome to RBI constructor");
	}

	void homeLoanROI() {
		System.out.println("You will get ROI for Home Loan based on your civil score");
	}
}

class SBI1 extends RBI1 {
	SBI1() {
		super(10);// will be written by java compiler
		System.out.println("Welcome to SBI1 constructor....");
	}

	void personalLoan() {
		System.out.println("Your personal loan ROI will be 12.50");
	}
}
	public class Example3 extends SBI1 {
		void myHome() {
			System.out.println("Welcome to myHome....");
		}

		public static void main(String[] args) {
			Example3 e3= new Example3();
			e3.myHome();
			e3.personalLoan();
			e3.homeLoanROI();		
		//	SBI1 s1= new SBI1();
		//	s1.homeLoanROI();
		//	s1.personalLoan();
				
		}

	}

