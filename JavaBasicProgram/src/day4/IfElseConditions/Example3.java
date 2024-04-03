package day4.IfElseConditions;

public class Example3 {

	public static void main(String[] args) {
		int age=19;
		char bldGroup='O';
		if(age>18){
			if(bldGroup=='O'){
				System.out.println("eligible for blood donation");
			}else{
				System.out.println("Not eligible for blood donation, due to bldGroup");
			}
		}else{
			System.out.println("Not eligible for blood donation, due to age");
		}
	}

}
// Eligable for blood donation or not 