package by.htp.lsn.calc;

public class Calculator {

	public void greetUser() {
		System.out.println("Hello user");
		//System.out.println("Shake hand");
		//System.out.println("Kiss user");
	}

	public int multiply(int x, int y) {

		int result = x * y;

		return result;
	}

	public int increment(int b) {
		b++;
		System.out.println(b);
		return b;
	}

	public int addition (int x, int y) {
		int sum = x+y;
		return sum;
	}
	
	public int division (int x, int y) {
		int result = x/y;
		return result;
	}
	
	public int sub (int x, int y) {
		int result = x-y;
		return result;
	}
	
	
	
}
