package ThisKeyword;

public class StaticGlobalVariableExample1 {
	static int age=35;
	double salary=45000.56;
	void display(double sal) {
		System.out.println("local salary: "+sal);
//		StaticGlobalVariableExample1 obj=new StaticGlobalVariableExample1();
//		System.out.println("NSGV salary: "+obj.salary);
			//or
		System.out.println("NSGV salary2: "+this.salary);
	}
	public static void main(String[] args) {
		int age=25;
		System.out.println("local age: "+age);
		System.out.println("global SV age: "+StaticGlobalVariableExample1.age);
		
		StaticGlobalVariableExample1 s1=new StaticGlobalVariableExample1();
		s1.display(55000.56);
	}

}
