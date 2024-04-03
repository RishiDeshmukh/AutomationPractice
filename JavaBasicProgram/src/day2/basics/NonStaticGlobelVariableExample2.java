package day2.basics;

public class NonStaticGlobelVariableExample2 {
	int num1,num2;
	static int result;
	public static void main(String[] args) {
		System.out.println("Program starts");
		NonStaticGlobelVariableExample2 r1=new NonStaticGlobelVariableExample2();
		System.out.println("Non static globel variable" +r1.num1);
		System.out.println("Non static globel variable" +r1.num2);
		r1.num1=45;
		r1.num2=35;
		result=r1.num1+r1.num2;
		System.out.println("Non static globel variable" +r1.num1);
		System.out.println("Non static globel variable" +r1.num2);
		System.out.println("Addition of two num :"+result);
		
		r1.num1=50;
		r1.num2=55;
		result=r1.num1+r1.num2;
		System.out.println("Non static globel variable" +r1.num1);
		System.out.println("Non static globel variable" +r1.num2);
		System.out.println("Addition of two num :"+result);
		
		NonStaticGlobelVariableExample2 r2=new NonStaticGlobelVariableExample2();
		r2.num1=200;
		r2.num2=300;
		result=r2.num1+r2.num2;
		System.out.println("Non static globel variable" +r2.num1);
		System.out.println("Non static globel variable" +r2.num2);
		System.out.println("Addition of two num :"+result);
	}
}
