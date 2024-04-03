package day1.basics;
	
public class StaticGlobelVariableExample3 {
	static double result;
	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1=10,num2=20;
		StaticGlobelVariableExample3.result=num1+num2;
		System.out.println("total" +result);
	}
}
