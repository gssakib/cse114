import java.util.Scanner;

public class Payday {

	/*
	 * Name: Gazi Sakib SBU ID - 109849940 Course No. - CSE 114 Assignment Name
	 * - : Managed Chaos (Problem 3)(Homework 3)
	 */

	public static void main(String[] args) {
		double fixedSalary = 0;
		double hourlyWage = 0;
		double hoursWorked = 0;
		double weeklySales = 0;
		double piecesProduced = 0;
		double payperpiece = 0;
		double grossPay = 0;

		Scanner stdin = new Scanner(System.in);

		System.out
				.print("Choose employee type: (m) manager (h) hourly (c) commission (p) pieceworker: ");
		String option = stdin.nextLine();

		if (option.equals("m")) {
			System.out.print("Enter weekly salary: ");
			fixedSalary = stdin.nextDouble();
			grossPay = fixedSalary;
		} else if (option.equals("h")) {
			System.out.print("Enter hourly wage: ");
			hourlyWage = stdin.nextDouble();

			System.out.print("Enter hours worked: ");
			hoursWorked = stdin.nextDouble();

			if (hoursWorked > 35) {
				grossPay = (2 * hourlyWage * (hoursWorked - 35))
						+ (hourlyWage * 35);
			} else if (hoursWorked <= 35 && hoursWorked > 0) {
				grossPay = hourlyWage * hoursWorked * 7;
			} else {
				System.out.println("Bad Input");
				System.exit(-1);
			}

		} else if (option.equals("c")) {
			System.out.print("Enter weekly sales: ");
			weeklySales = stdin.nextDouble();
			grossPay = 250.0 + +0.057 * weeklySales;

		} else if (option.equals("p")) {
			System.out.print("Enter pieces produced: ");
			piecesProduced = stdin.nextDouble();

			System.out.print("Enter pay per piece: ");
			payperpiece = stdin.nextDouble();
			grossPay = piecesProduced * payperpiece;

		} else {
			System.out.println("Bad Input");
			System.exit(-1);
		}

		double taxes = .125 * grossPay;
		double netPay = grossPay - taxes;

		System.out.printf("Gross pay: $%.2f%n", grossPay);
		System.out.printf("Taxes: $%.2f%n", taxes);
		System.out.printf("Net pay: $%.2f%n", netPay);

	}

}
