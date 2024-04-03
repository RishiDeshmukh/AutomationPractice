package String;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		//AddTwoNumbers(100,20);
		Scanner scn=new Scanner(System.in);
		System.out.println("Please add num1 for operation ");
		int n1=scn.nextInt();
		System.out.println("Please add num2 for operation ");
		int n2=scn.nextInt();
		System.out.println("please add operator for operation");
		char op=scn.next().charAt(0);
		AddTwoNumbers(op,n1,n2);
		}
	static void AddTwoNumbers(char ops,int num1,int num2) {
		int result=0;
		System.out.println("Number 1 : "+num1);
		System.out.println("Number 2 : "+num2);
		//System.out.println("result : "+result);
		if(ops =='+') {
			result=num1+num2;
		}else if (ops=='-') {
			result= num1-num2;
		}else if (ops == '*') {
			result=num1*num2;
		}else if (ops == '/') {
			result=num1/num2;
		}
		System.out.println("result : "+result);
	}

}
