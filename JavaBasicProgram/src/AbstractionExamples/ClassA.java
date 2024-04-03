package AbstractionExamples;

class ClassB {
	void test1() {
		System.out.println("Tast case 1");
	}
}

public class ClassA extends ClassB {

	public static void main(String[] args) {
		ClassA B1 = new ClassA();
		B1.test1();
	}

}
