package ThisKeyword;

public class NonStaticGlobalVariableExample1 {
	int age=35;
	void display() {
		System.out.println("Age from display() "+age);
	}
	void calling(int age) {//int age=25;
		System.out.println("Age from calling() "+age);
		System.out.println("Age global variable is,using keyword: "+this.age);
	}
	
	public static void main(String[] args) {
		
		NonStaticGlobalVariableExample1 n1=new NonStaticGlobalVariableExample1();
		n1.calling(25);
		n1.display();
		
	}

}
