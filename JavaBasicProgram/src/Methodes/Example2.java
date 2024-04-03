package Methodes;

public class Example2 {

	public static void main(String[] args) {
		addTwoNumber();
		System.out.println("*****************************");
		addTwoNumber();
		System.out.println("##############################");
		additionOfTwoNumbers(10,20);
		System.out.println("##############################");
		additionOfTwoNumbers(88,42);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!11");
		additionOfTwoNumbers(88,50);
	}
	static void additionOfTwoNumbers(int num1,int num2) {
		int result=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+result);
	}
	//create a method to add two numbers
	static void addTwoNumber() {
		int num1=10,num2=20,result;
		result=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+result);
	}
}
