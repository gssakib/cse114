import java.util.Scanner;

public class BaseToBase {
	/*
	 * Name: Gazi Sakib 
	 * SBU ID - 109849940 
	 * Course No. - CSE 114 
	 * Assignment Name- : Part II: : Base Conversion(Problem 2)(Homework 4)
	 */

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		System.out.print("Enter number: ");
		String num = stdin.nextLine();

		System.out.print("Enter starting base: ");
		int startBase = stdin.nextInt();

		System.out.print("Enter ending base: ");
		int endBase = stdin.nextInt();

		String result = Base2XBase(num, startBase, endBase);

		System.out.println("Result: " + result);

	}

	public static int base2Xdecimal(String val, int baseNo) {
		int converted = 0;
		int[] bases = new int[baseNo];
		for (int i = 0; i < baseNo; i++) {
			if (i > 9) {
				bases[i] = (int) 'A' + (i - 10);
				;
			} else {
				bases[i] = (int) '0' + i;
			}

		}

		for (int j = 0; j < val.length(); j++) {
			for (int k = 0; k < bases.length; k++) {
				if (val.charAt(j) == (char) bases[k]) {
					converted = converted
							+ k
							* (int) (Math.pow(baseNo, (val.length() - (1 + j))));
				}
			}

		}

		return converted;
	}

	public static String decimal2Xbase(String val, int baseNo) {
		int count = 0;
		int rem = 0;
		int quo = 0;
		String converted = "";
		int[] bases = new int[baseNo];
		for (int i = 0; i < baseNo; i++) {
			if (i > 9) {
				bases[i] = (int) 'A' + (i - 10);
				;
			} else {
				bases[i] = (int) '0' + i;
			}

		}

		for (int i = 0; i < val.length(); i++) {
			if (val.charAt(i) >= '0' && val.charAt(i) <= '9') {
				count++;
			}
		}

		if (count == val.length()) {
			quo = Integer.parseInt(val);

			while (quo != 0) {
				rem = quo % baseNo;
				quo = quo / baseNo;

				converted = Character.toString((char) bases[rem]) + converted;
			}

		}

		return converted;

	}

	public static String Base2XBase(String num, int startBase, int endBase) {

		return decimal2Xbase(Integer.toString(base2Xdecimal(num, startBase)),
				endBase);

	}

}
