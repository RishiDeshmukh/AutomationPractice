package VariableExamples;

public class VariablesExample2 {
	static int num1,num2;
	int result;
	public static void main(String[] args) {
		System.out.println("Programs starts");
		System.out.println("SGV num1: "+num1);
		System.out.println("SGV num2: "+num2);
		VariablesExample2 ref=new VariablesExample2();
		System.out.println("NSGV result: "+ref.result);		
		num1=20;
		num2=30;
		ref.result=num1+num2;
		System.out.println("Addition of two numbers: "+ref.result);
		
		VariablesExample2 ref2=new VariablesExample2();
		System.out.println("NSGV result with ref2: "+ref2.result);
		
		num1=45;
		num2=55;
		ref2.result=num1+num2;
		System.out.println("Addition, NSGV result with ref2: "+ref2.result);
		
		
		System.out.println("result from ref object: "+ref.result);
		System.out.println("result from ref2 object: "+ref2.result);
		
		System.out.println("Programs ends");
	}

}
