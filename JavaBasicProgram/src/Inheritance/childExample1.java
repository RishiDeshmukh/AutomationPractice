package Inheritance;

class parentExample1 {
	int age = 25;
	static double salary = 25000.56;
}

public class childExample1 extends parentExample1 {

	int empId = 1001;
	static int pinCode = 411014;

	public static void main(String[] args) {
		childExample1 c1=new childExample1();
		System.out.println("NSGV of ParentExample1 class age from ChildExample1 class: "+c1.age);
		System.out.println("NSGV of ChildExample1 class empID from ChildExample1 class: "+c1.empId);
		
		System.out.println("SGV of ParentExample1 class salary : "+parentExample1.salary);
		System.out.println("SGV of ChildExample1 class salary : "+childExample1.pinCode);
	}
}