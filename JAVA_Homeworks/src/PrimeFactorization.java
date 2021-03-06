import java.util.Scanner;

import java.util.ArrayList;

public class PrimeFactorization {
	/*
	 * Name: Gazi Sakib 
	 * SBU ID - 109849940 
	 * Course No. - CSE 114 
	 * Assignment Name- : Part I: Prime Factorization(Problem 1)(Homework 4)
	 */

	public static void main(String[] args) {
		int strdProduct = 0;
		int primePwr = 0;
		int prime = 2;
		int products = 1;
		int count = 0;
		ArrayList primePwrArray = new ArrayList();
		ArrayList primeArray = new ArrayList();
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter integers: ");
		String integers = stdin.nextLine();
		String[] splited = integers.split(" ");

		for (int i = 0; i < splited.length; i++) {
			// System.out.println(splited[i].length());
			for (int j = 0; j < splited[i].length(); j++) {
				if ((splited[i].charAt(j) >= '0' && splited[i].charAt(j) <= '9')
						|| (splited[i].charAt(j)) == '-') {
					count++;
				}
			}
			// System.out.println(count);
			if (count == splited[i].length()
					&& Integer.valueOf(splited[splited.length - 1]) < 0) {
				if (Integer.valueOf(splited[i]) > 0) {
					products = products * Integer.valueOf(splited[i]);
				} else if (Integer.valueOf(splited[i]) < 0
						&& (splited.length - 1 != i)) {
					System.out.println("Bad Input.");
					System.exit(-1);
				}
			} else {
				System.out.println("Bad Input.");
				System.exit(-1);
			}
			count = 0;

		}
		strdProduct = products;
		while (products != 1) {
			// System.out.println(prime);
			while (products % prime == 0) {
				products = products / prime;
				primePwr++;

			}
			primeArray.add(prime);
			primePwrArray.add(primePwr);
			primePwr = 0;
			prime++;
			while (!(isPrime(prime))) {
				prime++;
			}
		}

		System.out.println("Product: " + strdProduct);
		System.out.print("Prime factorization: ");
		for (int k = 0; k < primeArray.size(); k++) {
			if (!primePwrArray.get(k).equals(0)) {
				System.out.print(primeArray.get(k) + "^" + primePwrArray.get(k)
						+ " ");
			}
		}

	}

	public static boolean isPrime(int num) {

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
