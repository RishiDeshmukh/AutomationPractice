package day2.basics;

public class NonStaticGlobelVariableExample1 {
	int num1,num2;
	public static void main(String[] args) {
		System.out.println("Program starts");
		//Decelaration
		/*NonStaticGlobelVariableExample1 ref;
		//Initialization
		ref= new NonStaticGlobelVariableExample1();
		//or both decelaration and initialization same time*/
		NonStaticGlobelVariableExample1 ref=new NonStaticGlobelVariableExample1();
		
		System.out.println("Non static globle variable num 1:"+ref.num1);
		System.out.println("Non static globle variable num 2:"+ref.num2);
		ref.num1=10;
		ref.num2=20;
		System.out.println("Non static globle variable num 1:"+ref.num1);
		System.out.println("Non static globle variable num 2:"+ref.num2);
		
		ref.num1=100;
		ref.num2=300;
		System.out.println("Non static globle variable num 1:"+ref.num1);
		System.out.println("Non static globle variable num 2:"+ref.num2);
		System.out.println("Program ends");
	}

}
