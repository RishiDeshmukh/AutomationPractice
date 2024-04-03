package Inheritance;

class RBI {
	RBI() {
		System.out.println("Welcome to RBI constructor");
	}

	void homeloanROI() {
		System.out.println("You will get ROI for home loan based on your civil score");
	}
}
class SBI extends RBI{
	SBI (){
		System.out.println("Welcome to SBI constructor");
	}
	void Personalloan() {
		System.out.println("Your personal loan ROI will be 12.50");
	}
}
public class Example2 {

	public static void main(String[] args) {
		SBI s1=new SBI();
		s1.homeloanROI();
		s1.Personalloan();
	}

}
