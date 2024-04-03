package String;

public class Stringclass3 {

	public static void main(String[] args) {
		String s1 = "I am from UP, I am workig in Accenture, I working as QA Deleivery Head";
		System.out.println("Actual String: " + s1);
		String[] strAry = s1.split(" ");
		for (String s : strAry) {
			System.out.println(s);
		}
		System.out.println("***************************");
		String s2 = "I am from UP";
		System.out.println("Actual String: " + s2);
		String[] strAry2 = s2.split(" ", 3);
		for (String s : strAry2) {
			System.out.println(s);
		}
		System.out.println("***************************");
		String s3= " I am Rishi from maharashtra";
		System.out.println("Actual String : "+ s3);
		String[] strAry3= s3.split(" ",4);
		for (String s: strAry3) {
			System.out.println(s);
			
		}
		System.out.println("***************************");
		String s4="I am from Pune";
		System.out.println("Actual String: "+s4);
		String str[]=s4.split(" ");
		String temp="";
		for(int i=str.length-1;i>=0;i--) {
			temp=temp+" "+str[i];
		}
	}

}
