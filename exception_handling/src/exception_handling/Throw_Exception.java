package exception_handling;

//Throwing Unchecked Exception.....
public class Throw_Exception {
	public static void Validate(int age) {
		if (age < 18) {
			throw new java.lang.ArithmeticException("Person is not eligible for Voting...");
		} else {
			System.out.println("Person is Voting...");
		}

	}

	public static void main(String[] args) {
		Validate(15);
		System.out.println("rest of Things");
	}

}
