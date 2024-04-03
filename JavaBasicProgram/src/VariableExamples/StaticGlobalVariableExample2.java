package VariableExamples;

public class StaticGlobalVariableExample2 {
	static int num1,num2;
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("STD: static global variable num1: "+StaticGlobalVariableExample2.num1);
		System.out.println("STD: static global variable num2: "+StaticGlobalVariableExample2.num2);
		StaticGlobalVariableExample2.num1=25;
		StaticGlobalVariableExample2.num2=30;
		System.out.println("static global variable num1: "+StaticGlobalVariableExample2.num1);
		System.out.println("static global variable num2: "+StaticGlobalVariableExample2.num2);
		System.out.println("Program ends");
	}

}

