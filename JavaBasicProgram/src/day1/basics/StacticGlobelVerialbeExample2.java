package day1.basics;

public class StacticGlobelVerialbeExample2 {
	static int num1,num2;
	static double result;
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("static global variable num1: "+num1);
		System.out.println("static global variable num2: "+num2);
		StacticGlobelVerialbeExample2.num1=25;
		StacticGlobelVerialbeExample2.num2=30;
		result=num1+num2;
		System.out.println("static global variable num1: "+StacticGlobelVerialbeExample2.num1);
		System.out.println("static global variable num2: "+StacticGlobelVerialbeExample2.num2);
		System.out.println("Final result : "+result);
		System.out.println("Program ends");

	}

}
