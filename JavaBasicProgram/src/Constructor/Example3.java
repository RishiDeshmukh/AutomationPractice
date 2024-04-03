package Constructor;

public class Example3 {
	Example3(){
		System.out.println("I am zero-parama");
	}
	Example3(int num){
		System.out.println("I am int-param cons");
		age=num;
	}
	int age;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example3 e1=new Example3();
		System.out.println("age value with e1: "+e1.age);
		
		  Example3 e2=new Example3(50);
		  System.out.println("age value with e2: "+e2.age);
		  System.out.println("Program Ends");
		 
	}
}