import java.util.Scanner;

public class StonyBrookResort {

	/*
	 * Name: Gazi Sakib 
	 * SBU ID - 109849940 
	 * Course No. - CSE 114 
	 * Assignment Name - : What A View! Wait, What’s That Smell? (Problem 2)(Homework 3)
	 */

	public static void main(String[] args) {
		final double EACHADULTPERDAY = 125;
		final double EACHCHILDTPERDAY = 75;
		double discount = 0;
		double serviceCharge = 0;
		Scanner stdin = new Scanner(System.in);

		System.out.print("Enter number of adults: ");
		double adultsNo = stdin.nextDouble();

		System.out.print("Enter number of children: ");
		double childrenNo = stdin.nextDouble();

		System.out.print("Enter length of vacation in days:  ");
		double vacationDays = stdin.nextDouble();

		System.out.print("Enter day of week that vacation starts: ");
		String startDay = stdin.nextLine();
		startDay = stdin.nextLine();

		double totalBefore = vacationDays
				* ((EACHADULTPERDAY * adultsNo) + (EACHCHILDTPERDAY * childrenNo));

		if (vacationDays > 5) {
			discount = (vacationDays - 5) * 0.25 * EACHADULTPERDAY * adultsNo;
		}

		if(startDay.length() == 6){
			
			if (((startDay.substring(0,1).equals("M")|| startDay.substring(0,1).equals("m")) && (startDay.substring(1,2).equals("o")|| startDay.substring(1,2).equals("O")) && (startDay.substring(2,3).equals("n")|| startDay.substring(2,3).equals("N")) && (startDay.substring(3,4).equals("D")|| startDay.substring(3,4).equals("d")) && (startDay.substring(4,5).equals("A")|| startDay.substring(4,5).equals("a") && (startDay.substring(5,6).equals("Y")|| startDay.substring(5,6).equals("y"))) && vacationDays <= 4
					&& (adultsNo + childrenNo) > 1)) {
				discount = discount + 150;

			}

		}
			
		if ((adultsNo + childrenNo) >= 6) {
			serviceCharge = 0.05 * totalBefore;
		}

		double totalAfter = totalBefore + serviceCharge - discount;
		// System.out.println(startDay);
		System.out.printf("Total before discounts: $%.2f%n", totalBefore);
		System.out.printf("Discounts: $%.2f%n", discount);
		System.out.printf("Service charges: $%.2f%n", serviceCharge);
		System.out.printf("Grand total: $%.2f%n", totalAfter);

	}

}
