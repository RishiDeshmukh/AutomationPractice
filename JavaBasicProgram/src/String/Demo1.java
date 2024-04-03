package String;
import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		double salary;
		int age;
		String name;
		boolean valid;
		System.out.println("Please enter the age ");
		age = sca.nextInt();
		System.out.println("Please enter salary ");
		salary = sca.nextDouble();
		System.out.println("Please enter name ");
		name = sca.next();
		System.out.println("Please enter valid or not ");
		valid = sca.nextBoolean();
		System.out.println(" Age: "+age);
		System.out.println(" Age: "+salary);
		System.out.println(" Age: "+name);
		System.out.println(" Age: "+valid);
		int num1, num2;
		num1 = sca.nextInt();
		System.out.println(" Please give num 1");
		num2 = sca.nextInt();
		System.out.println(" Please give num 2");
		char op;
		System.out.println("Please enter your operation");
		op = sca.next().charAt(0);
		System.out.println("Result of the operation betweeb two no.: "+OperationOfTwoNo(op,num1,num2));
	}
		

	static int OperationOfTwoNo(char op,int num1,int num2) {
		int result=0;
		System.out.println("Number 1 : "+num1);
		System.out.println("Number 2 : "+num2);
		if (op=='+') {
			result= num1+num2;
		}else if (op=='-') {
			result= num1-num2;
		}else if (op=='*') {
			result= num1*num2;
		}else if (op=='/');
		    result= num1/num2;
		    System.out.println("Result : "+result); 
	}
	
}
