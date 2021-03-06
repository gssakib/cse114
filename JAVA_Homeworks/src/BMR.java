import java.util.Scanner;
public class BMR {

	public static void main(String[] args) {
/*
		Name: Gazi Sakib
		SBU ID - 109849940
		Course No. - CSE 114
		Assignment Name - : Basal Metabolic Rate (Problem 4)(Homework 2) 

*/
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the person�s weight in pounds: ");
		double weight = in.nextDouble();
		
		System.out.print("Enter the person�s height in inches: ");
		double height = in.nextDouble();
		
		System.out.print("Enter the person�s age: ");
		double age = in.nextDouble();
		
		double manBMR = 10 * (weight * 0.45359237) + 6.25 * (height * 2.54)  - 5 * age + 5;
		double womenBMR = 10 * (weight * 0.45359237) + 6.25 * (height * 2.54) - 5 * age - 161;
		
		System.out.printf("BMR for a man: %.6f kcal/day%n", manBMR);
		System.out.printf("BMR for a women: %.6f kcal/day%n", womenBMR);
		
	}

}
