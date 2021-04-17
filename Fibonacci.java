package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static final int MAX_TERM_VALUE = 10000;

	public static void main(String[] args) {
		int x1 = 0;
		int x2 = 1;
		
		System.out.println("This program lists the Fibonacci sequence.");
		
		while (x1 <= MAX_TERM_VALUE) {
			int x3 = x1 + x2;
			System.out.println(x1);
			x1 = x2;
			x2 = x3;
			
		}
	}

}
