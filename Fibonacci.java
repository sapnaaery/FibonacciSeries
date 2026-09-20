package day6;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int terms = scanner.nextInt();
		int a = 0, b = 1;
		System.out.println("Fibonacci Sequence: ");
		for (int i = 1; i <= terms; i++) {
			System.out.println(a + " ");
			int nextNum = a + b;
			a = b;
			b = nextNum;
		}

	}

}
