//Anu Slorah

import java.util.ArrayList;
import java.util.Iterator;

public class Sieve {

	public static void main(String[] args) {
		ArrayList<Integer> prime = new ArrayList<Integer>();

		for (int i = 2; i <= 100; i++) {
			prime.add(i);
		}

		System.out.println("ArrayList of numbers 2 - 100");
		System.out.println(prime);

		Iterator<Integer> iter = prime.iterator();

		for (int i = 2; i <= prime.size(); i++) {
			int result = prime.get(i);
			if (result % 2 == 0) {
				prime.remove(i);
			}
		}

		for (int i = 3; i <= prime.size(); i++) {
			int result = prime.get(i);
			if (result % 3 == 0) {
				prime.remove(i);
			}
		}

		for (int i = 5; i <= prime.size() - 1; i++) {
			int result = prime.get(i);
			if (result % 5 == 0) {
				prime.remove(i);
			}
		}

		for (int i = 7; i <= prime.size() - 1; i++) {
			int result = prime.get(i);
			if (result % 7 == 0) {
				prime.remove(i);
			}
		}
		
		System.out.println("ArrayList of prime numbers 2 - 100");
		System.out.println(prime);
	}
}
