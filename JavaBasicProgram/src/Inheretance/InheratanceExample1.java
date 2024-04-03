package Inheretance;
class xxxxxx {
	int salary =10000 ;
	static int empID= 123;
}

public class InheratanceExample1 {
	int pagar = 15000;
static int pincode = 444601;
	public static void main(String[] args) {
		// calling static vabriable from another class by standerd classname.varialbe
		System.out.println(" no of empID "+ xxxxxx.empID);
		System.out.println("pincode "+ InheratanceExample1.pincode);
		
		// calling non static members of classes by standerd method creating an Object.
		xxxxxx x1=new xxxxxx();
		System.out.println("salary "+ x1.salary);
		// To access non static members of diffrent classes we have to make new new 
		// object every time for every diffrent class non static members.
		
		InheratanceExample1 i1=new InheratanceExample1();
		System.out.println("pagar "+ i1.pagar);
		

	}

}
