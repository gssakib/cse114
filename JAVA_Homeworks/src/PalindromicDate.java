import java.util.Scanner;

public class PalindromicDate {

	public static void main(String[] args) {
		/*
		 * Name: Gazi Sakib 
		 * SBU ID - 109849940 
		 * Course No. - CSE 114 
		 * Assignment Name - : Time Flies When You�re Having Fun (Problem 1)(Homework 3)
		 */

		Scanner stdin = new Scanner(System.in);

		System.out.print("Enter month: ");
		String month = stdin.nextLine();
		int monthNo = 0;
		int day = 0;
		int year = 0;
		int monthLen = 0;
		String reformatted = null;

		System.out.print("Enter day: ");
		day = stdin.nextInt();
		if (day <= 0 || day > 31) {
			System.out.println("Bad input.");
			System.exit(-1);
		}

		System.out.print("Enter year: ");
		year = stdin.nextInt();
		if (year <= 1600) {
			System.out.println("Bad input.");
			System.exit(-1);
		}

		monthLen = month.length();

		if (monthLen == 7) {

			if ((month.substring(0, 1).equals("J") || month.substring(0, 1)
					.equals("j"))
					&& (month.substring(1, 2).equals("a") || month.substring(1,
							2).equals("A"))
					&& (month.substring(2, 3).equals("n") || month.substring(2,
							3).equals("N"))
					&& (month.substring(3, 4).equals("u") || month.substring(3,
							4).equals("U"))
					&& (month.substring(4, 5).equals("a") || month.substring(4,
							5).equals("A"))
					&& (month.substring(5, 6).equals("r") || month.substring(5,
							6).equals("R"))
					&& (month.substring(6, 7).equals("y") || month.substring(6,
							7).equals("Y"))) {
				monthNo = 1;

			} else if ((month.substring(0, 1).equals("O") || month.substring(0,
					1).equals("o"))
					&& (month.substring(1, 2).equals("c") || month.substring(1,
							2).equals("C"))
					&& (month.substring(2, 3).equals("t") || month.substring(2,
							3).equals("T"))
					&& (month.substring(3, 4).equals("o") || month.substring(3,
							4).equals("O"))
					&& (month.substring(4, 5).equals("b") || month.substring(4,
							5).equals("B"))
					&& (month.substring(5, 6).equals("e") || month.substring(5,
							6).equals("E"))
					&& (month.substring(6, 7).equals("R") || month.substring(6,
							7).equals("r"))) {
				monthNo = 10;
			} else {
				System.out.println("Bad input.");
				System.exit(-1);
			}

		} else if (monthLen == 8) {
			// System.out.println(monthLen);
			if ((month.substring(0, 1).equals("N") || month.substring(0, 1)
					.equals("n"))
					&& (month.substring(1, 2).equals("o") || month.substring(1,
							2).equals("O"))
					&& (month.substring(2, 3).equals("v") || month.substring(2,
							3).equals("V"))
					&& (month.substring(3, 4).equals("e") || month.substring(3,
							4).equals("E"))
					&& (month.substring(4, 5).equals("m") || month.substring(4,
							5).equals("M"))
					&& (month.substring(5, 6).equals("b") || month.substring(5,
							6).equals("B"))
					&& (month.substring(6, 7).equals("e") || month.substring(6,
							7).equals("E"))
					&& (month.substring(7, 8).equals("r") || month.substring(7,
							8).equals("R"))) {
				monthNo = 11;
				if (day == 31) {
					System.out.println("Bad input.");
					System.exit(-1);
				}
			} else if ((month.substring(0, 1).equals("D") || month.substring(0,
					1).equals("d"))
					&& (month.substring(1, 2).equals("e") || month.substring(1,
							2).equals("E"))
					&& (month.substring(2, 3).equals("c") || month.substring(2,
							3).equals("C"))
					&& (month.substring(3, 4).equals("e") || month.substring(3,
							4).equals("E"))
					&& (month.substring(4, 5).equals("m") || month.substring(4,
							5).equals("M"))
					&& (month.substring(5, 6).equals("b") || month.substring(5,
							6).equals("B"))
					&& (month.substring(6, 7).equals("e") || month.substring(6,
							7).equals("E"))
					&& (month.substring(7, 8).equals("r") || month.substring(7,
							8).equals("R"))) {
				monthNo = 12;
			} else if ((month.substring(0, 1).equals("F") || month.substring(0,
					1).equals("f"))
					&& (month.substring(1, 2).equals("e") || month.substring(1,
							2).equals("E"))
					&& (month.substring(2, 3).equals("b") || month.substring(2,
							3).equals("B"))
					&& (month.substring(3, 4).equals("r") || month.substring(3,
							4).equals("R"))
					&& (month.substring(4, 5).equals("u") || month.substring(4,
							5).equals("U"))
					&& (month.substring(5, 6).equals("a") || month.substring(5,
							6).equals("A"))
					&& (month.substring(6, 7).equals("r") || month.substring(6,
							7).equals("R"))
					&& (month.substring(7, 8).equals("y") || month.substring(7,
							8).equals("Y"))) {
				monthNo = 2;
				if ((day == 28 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)))
						|| (day == 29 && !((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)))) {
					System.out.println("Bad input.");
					System.exit(-1);
				}
			} else {
				System.out.println("Bad input.");
				System.exit(-1);
			}

		} else if (monthLen == 5) {
			if ((month.substring(0, 1).equals("M") || month.substring(0, 1)
					.equals("m"))
					&& (month.substring(1, 2).equals("a") || month.substring(1,
							2).equals("A"))
					&& (month.substring(2, 3).equals("r") || month.substring(2,
							3).equals("R"))
					&& (month.substring(3, 4).equals("c") || month.substring(3,
							4).equals("C"))
					&& (month.substring(4, 5).equals("H") || month.substring(4,
							5).equals("H"))) {
				monthNo = 3;
			} else if ((month.substring(0, 1).equals("A") || month.substring(0,
					1).equals("a"))
					&& (month.substring(1, 2).equals("p") || month.substring(1,
							2).equals("P"))
					&& (month.substring(2, 3).equals("r") || month.substring(2,
							3).equals("R"))
					&& (month.substring(3, 4).equals("i") || month.substring(3,
							4).equals("I"))
					&& (month.substring(4, 5).equals("L") || month.substring(4,
							5).equals("l"))) {
				monthNo = 4;
				if (day == 31) {
					System.out.println("Bad input.");
					System.exit(-1);
				}
			} else {
				System.out.println("Bad input.");
				System.exit(-1);
			}

		} else if (monthLen == 3) {
			if ((month.substring(0, 1).equals("M") || month.substring(0, 1)
					.equals("m"))
					&& (month.substring(1, 2).equals("a") || month.substring(1,
							2).equals("A"))
					&& (month.substring(2, 3).equals("y") || month.substring(2,
							3).equals("Y"))) {

			} else {
				System.out.println("Bad input.");
				System.exit(-1);
			}

		} else if (monthLen == 4) {
			if ((month.substring(0, 1).equals("j") || month.substring(0, 1)
					.equals("J"))
					&& (month.substring(1, 2).equals("U") || month.substring(1,
							2).equals("u"))
					&& (month.substring(2, 3).equals("N") || month.substring(2,
							3).equals("n"))
					&& (month.substring(3, 4).equals("E") || month.substring(3,
							4).equals("e"))) {
				monthNo = 6;
				if (day == 31) {
					System.out.println("Bad input.");
					System.exit(-1);
				}
			} else if ((month.substring(0, 1).equals("J") || month.substring(0,
					1).equals("j"))
					&& (month.substring(1, 2).equals("U") || month.substring(1,
							2).equals("u"))
					&& (month.substring(2, 3).equals("L") || month.substring(2,
							3).equals("l"))
					&& (month.substring(3, 4).equals("Y") || month.substring(3,
							4).equals("y"))) {
				monthNo = 7;
			} else {
				System.out.println("Bad input.");
				System.exit(-1);
			}

		} else if (monthLen == 6) {
			if ((month.substring(0, 1).equals("a") || month.substring(0, 1)
					.equals("A"))
					&& (month.substring(1, 2).equals("U") || month.substring(1,
							2).equals("u"))
					&& (month.substring(2, 3).equals("G") || month.substring(2,
							3).equals("g"))
					&& (month.substring(3, 4).equals("u") || month.substring(3,
							4).equals("U"))
					&& (month.substring(4, 5).equals("S") || month.substring(4,
							5).equals("s"))
					&& (month.substring(5, 6).equals("T") || month.substring(5,
							6).equals("t"))) {
				monthNo = 8;
			} else {
				System.out.println("Bad input.");
				System.exit(-1);
			}

		} else if (monthLen == 9) {
			if ((month.substring(0, 1).equals("S") || month.substring(0, 1)
					.equals("s"))
					&& (month.substring(1, 2).equals("e") || month.substring(1,
							2).equals("E"))
					&& (month.substring(2, 3).equals("P") || month.substring(2,
							3).equals("p"))
					&& (month.substring(3, 4).equals("T") || month.substring(3,
							4).equals("t"))
					&& (month.substring(4, 5).equals("E") || month.substring(4,
							5).equals("e"))
					&& (month.substring(5, 6).equals("M") || month.substring(5,
							6).equals("m"))
					&& (month.substring(6, 7).equals("B") || month.substring(6,
							7).equals("b"))
					&& (month.substring(7, 8).equals("e") || month.substring(7,
							8).equals("E"))
					&& (month.substring(8, 9).equals("r") || month.substring(8,
							9).equals("R"))) {
				monthNo = 9;
				if (day == 31) {
					System.out.println("Bad input.");
					System.exit(-1);
				}
			} else {
				System.out.println("Bad input.");
				System.exit(-1);
			}

		}

		if (day < 10 && monthNo < 10) {
			reformatted = "0" + Integer.toString(monthNo) + "/" + "0"
					+ Integer.toString(day) + "/"
					+ (Integer.toString(year)).substring(2, 4);
		} else if (day >= 10 && monthNo < 10) {
			reformatted = "0" + Integer.toString(monthNo) + "/"
					+ Integer.toString(day) + "/"
					+ (Integer.toString(year)).substring(2, 4);
		} else if (day >= 10 && monthNo >= 10) {
			reformatted = Integer.toString(monthNo) + "/"
					+ Integer.toString(day) + "/"
					+ (Integer.toString(year)).substring(2, 4);
		} else if (day < 10 && monthNo >= 10) {
			reformatted = Integer.toString(monthNo) + "/" + "0"
					+ Integer.toString(day) + "/"
					+ (Integer.toString(year)).substring(2, 4);
		} else {
			System.out.println("Bad input.");
		}
		
		
		System.out.println("Reformatted date: "+ reformatted);

		if (reformatted.substring(0, 1).equals(reformatted.substring(7, 8))
				&& reformatted.substring(1, 2).equals(
						reformatted.substring(6, 7))
				&& reformatted.substring(3, 4).equals(
						reformatted.substring(4, 5))) {
			System.out.println("Palindrome? yes");
		} else {
			System.out.println("Palindrome? no");
		}

		

	}

}
