package ThisKeyword;

public class ThisKeywordExample4 {
	int age=25;
	void display() {
		System.out.println("I am display() ....");
		System.out.println("Age: "+age);
	}
	void display(int age) {
		System.out.println("I am display(int) ....");
		System.out.println("local Age: "+age);
//		Example1 ref=new Example1();
//		System.out.println("NSGV age: "+ref.age);
		System.out.println("NSGV age: "+this.age);
		System.out.println("this keyword value: "+this);
		
		this.calling();
	}
	void calling() {
		System.out.println("I am calling.....");
	}
	public static void main(String[] args) {
		ThisKeywordExample4 e1=new ThisKeywordExample4();
		e1.display();
		e1.display(10);
		System.out.println("e1 value: "+e1);
	}
}


