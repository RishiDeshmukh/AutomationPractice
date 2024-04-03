package day1.basics;

public class StaticGlobelExample1 {
	static double result;
	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1=5, num2=10;
		result=num1+num2;
		System.out.println("local num1:"+num1);
		System.out.println("local num2:"+num2);
		System.out.println("Globel result:"+result);
		System.out.println("Program ends");
	}

}
