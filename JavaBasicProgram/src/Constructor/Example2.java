package Constructor;

public class Example2 {

	Example2(){
		System.out.println("I am zero-paramiter constructor");
		//age=25;
	}
	int age;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		//to load non-static members into the memory creating an object
		Example2 ref=new Example2();
		System.out.println("age using ref: "+ref.age);
		System.out.println("******************************");
		Example2 ref2=new Example2();
		System.out.println("age using ref2: "+ref2.age);
		System.out.println("Program Ends");
	}
}