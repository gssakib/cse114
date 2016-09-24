import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		/*
		 * Name: Gazi Sakib SBU ID - 109849940 Course No. - CSE 114 Assignment
		 * Name - : What Day is It? (Problem 4)(Homework 3)
		 */

		Scanner stdin = new Scanner(System.in);

		System.out.print("Enter year (e.g., 1918): ");
		String year = stdin.nextLine();
		int yearNo = Integer.parseInt(year);

		System.out.print("Enter month (1-12): ");
		int month = stdin.nextInt();

		System.out.print("Enter the day of the month (1-31): ");
		int day = stdin.nextInt();

		if (month == 1) {
			month = 13;
			yearNo--;

		} else if (month == 2) {
			month = 14;
			yearNo--;
		}

		int j = Integer.parseInt(Integer.toString(yearNo).substring(0, 2));
		int k = Integer.parseInt(Integer.toString(yearNo).substring(2, 4));

		/*
		 * System.out.println(day); System.out.println(month);
		 * System.out.println(k); System.out.println(j);
		 */

		int d = (day + ((13 * (month + 1)) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

		if (d == 1) {
			System.out.println("The day of the week is Sunday");
		} else if (d == 2) {
			System.out.println("The day of the week is Monday");
		} else if (d == 3) {
			System.out.println("The day of the week is Tuesday");
		} else if (d == 4) {
			System.out.println("The day of the week is Wednesday");
		} else if (d == 5) {
			System.out.println("The day of the week is Thursday");
		} else if (d == 6) {
			System.out.println("The day of the week is Friday");
		} else if (d == 0) {
			System.out.println("The day of the week is Saturday");
		}

	}

}
