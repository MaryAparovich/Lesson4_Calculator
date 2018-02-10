package by.htp.lsn.runner;

import java.util.Scanner;

import by.htp.lsn.calc.Calculator;

public class MainApp {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.greetUser();

		Scanner MyScanner = new Scanner(System.in);
		System.out.println("Input 2 numbers:");
		int x = MyScanner.nextInt();
		int y = MyScanner.nextInt();
		System.out.println("Input procedure:");
		String op = MyScanner.next();
		MyScanner.close();

		int result;

		if (op.equals("+")) {
			int sum = calc.addition(x, y);
			System.out.println(sum);
		} else if (op.equals("*")) {
			result = calc.multiply(x, y);
			System.out.println(result);
		} else if (op.equals("/")) {
			result = calc.division(x, y);
			System.out.println(result);
		} else if (op.equals("-")) {
			result = calc.sub(x, y);
			System.out.println(result);
		}
		/*
		 * 
		 * int result = calc.increment(a); System.out.println(result);
		 */

		/*
		 * int result = calc.multiply(8, 4); System.out.println(result);
		 * 
		 * int result2 = calc.multiply(x, y); System.out.println(result2);
		 */

		/*
		 * int sum = calc.addition(5, 31); System.out.println(sum);
		 */

	}

}
