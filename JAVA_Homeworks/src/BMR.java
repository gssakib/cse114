import java.util.Scanner;
public class BMR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the person’s weight in pounds: ");
		double weight = in.nextDouble();
		
		System.out.print("Enter the person’s height in inches: ");
		double height = in.nextDouble();
		
		System.out.print("Enter the person’s age: ");
		double age = in.nextDouble();
		
		double manBMR = 10 * (weight * 0.453592) + 6.25 * (height * 2.54)  - 5 * age + 5;
		double womenBMR = 10 * (weight * 0.453592) + 6.25 * (height * 2.54) - 5 * age - 161;
		
		System.out.println("BMR for a man: " + manBMR + " kcal/day");
		System.out.println("BMR for a woman: " + womenBMR + " kcal/day");
	}

}
