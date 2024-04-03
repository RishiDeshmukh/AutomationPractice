package String;

public class stringconcat {

	public static void main(String[] args) {
		
		String str = "Pune " +1234;
		System.out.println("str: " +str);
		String s1="Mumbai"+null;
		System.out.println("s1: "+s1);
		System.out.println("********************************");
		String s2=str.concat("Delhi");
		System.out.println("s2: "+s2);
		String s3 = s2.concat("UKingdom");
		System.out.println("s3 :"+s3);
	}

}
