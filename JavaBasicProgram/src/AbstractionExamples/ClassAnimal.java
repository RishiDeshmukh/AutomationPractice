package AbstractionExamples;
class Tiger {
	void test1() {
		System.out.println("Tiger can walk");
	}
}
public class ClassAnimal extends Tiger {

	public static void main(String[] args) {
		Tiger T1=new Tiger();
		T1.test1();
	}

}
