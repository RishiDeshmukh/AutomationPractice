package Constructor;

public class ConstructorOverloading {
	int age;
	double salary;

	ConstructorOverloading() {
		System.out.println("I am zero Parameter constructor...");
	}

	ConstructorOverloading(int num) {
		System.out.println("I am int Parameter constructor...");
		age = num;
	}

	ConstructorOverloading(double sal) {
		System.out.println("I am double Parameter constructor...");
		salary = sal;
	}

	ConstructorOverloading(int n1, double s1) {
		System.out.println("I am int and double parameter constructor...");
		age = n1;
		salary = s1;
	}

	public static void main(String[] args) {
		ConstructorOverloading e1 = new ConstructorOverloading(250, 25.00);
		System.out.println("age with e1 refrence " + e1.age);
		System.out.println("salary with e1 refrence " + e1.salary);

	}

}
